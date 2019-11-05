import Service.TelegramBotInterface;
import Service.TelegramBotInterfaceImpl;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.TelegramBotAdapter;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.request.ChatAction;
import com.pengrad.telegrambot.request.GetUpdates;
import com.pengrad.telegrambot.request.SendChatAction;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.BaseResponse;
import com.pengrad.telegrambot.response.GetUpdatesResponse;
import com.pengrad.telegrambot.response.SendResponse;

import java.util.List;

public class Main {


    public static void main(String[] args) {

        int m = 0;

        TelegramBotInterface telegramBotInterface = new TelegramBotInterfaceImpl();

        //loop infinito pode ser alterado por algum timer de interval curto
        while (true) {

            GetUpdatesResponse mensagensPendentes = telegramBotInterface.recuperarMensagensPendentes(m);

            List<Update> updates = telegramBotInterface.listarMensagens(mensagensPendentes);

            //análise de cada ação da mensagem
            for (Update update : updates) {
                //atualização do off-set
                m = update.updateId() + 1;
                System.out.println("Recebendo mensagem:" + update.message().text());

                String msgResponse = telegramBotInterface.processarMensagem(update.message().text().toLowerCase());

                System.out.println(msgResponse);

                SendResponse response = telegramBotInterface.envioResposta(update, msgResponse);

                System.out.println("Mensagem enviada? "+response.isOk());
            }
        }
    }


}


