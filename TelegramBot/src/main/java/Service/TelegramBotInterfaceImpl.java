package Service;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.TelegramBotAdapter;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.request.ChatAction;
import com.pengrad.telegrambot.request.GetUpdates;
import com.pengrad.telegrambot.request.SendChatAction;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.GetUpdatesResponse;
import com.pengrad.telegrambot.response.SendResponse;

import java.util.List;

public class TelegramBotInterfaceImpl implements TelegramBotInterface {

    //Criação do objeto bot com as informações de acesso
    private static TelegramBot bot = TelegramBotAdapter.build("1042814714:AAGJiLHrPZMy-JGa97ruqnAEGxh1ws0GCFE");

    private static final int LIMITE = 0;

    public GetUpdatesResponse recuperarMensagensPendentes(int m) {
        return bot.execute(new GetUpdates().limit(100).offset(m));
    }

    public List<Update> listarMensagens(GetUpdatesResponse mensagensPendentes) {
        return mensagensPendentes.updates();
    }

    public SendResponse envioResposta(Update update, String mensagemResponse) {
        bot.execute(new SendChatAction(update.message().chat().id(), ChatAction.typing.name()));
        return bot.execute(new SendMessage(update.message().chat().id(), mensagemResponse));
    }

    public String processarMensagem(String mensagem) {

        String msgResponse = "";
        int cont = 0;

        for(OpcoesChat opcoes : OpcoesChat.values()){
            if(mensagem.toUpperCase().contains(opcoes.name())){

                switch(OpcoesChat.valueOf(opcoes.name())){
                    case OI:
                    case OLA:
                    case OLÁ:
                        msgResponse = "Olá, tudo bem?";
                        break;
                    case TCHAU:
                        msgResponse = "Tchau! Até Breve!";
                        break;
                    case ONDE:
                        msgResponse = "Sou do Telegram";
                        break;
                    case PAIS:
                        msgResponse = "Moro na nuvem, país Internet";
                        break;
                    case IDADE:
                        msgResponse = "Nasci em 03/11/2019, tenho 1 dia!";
                        break;
                    case BEM:
                        msgResponse = "Estou ótimo também! \uD83D\uDE09";
                        break;
                    case FAZ:
                        msgResponse = "Gosto de fazer o que me faz bem, responder as pessoas. \uD83D\uDE03";
                        break;
                    case ANOS:
                        msgResponse = "Nasci em 03/11/2019, tenho 1 dia!";
                        break;
                    case PROFISSAO:
                        msgResponse = "Minha profissão é responder perguntas, aliás o que deseja?";
                        break;
                    case RICO:
                    case VIAGEM:
                    case VIAJAR:
                    case DINHEIRO:
                        msgResponse = "Simples, trabalhe bastante \uD83D\uDE1D";
                        break;
                    case LEGAL:
                        msgResponse = "Sim, maneiro \uD83D\uDE0E";
                        break;
                    case BOM:
                        msgResponse = "Bom é fazer o bem para as pessoas \uD83D\uDE01";
                        break;
                    case SONO:
                        msgResponse = "Eu não tenho sono";
                        break;
                    case AÍ:
                        msgResponse = "Estou sempre aqui!";
                        break;
                    case SORTE:
                        msgResponse = "Sorte é o resultado de muito esforço, trabalho e dedicação";
                        break;
                    case DORMIR:
                        msgResponse = "Dormir é para os fracos \uD83D\uDE05";
                        break;
                    case CERTEZA:
                        msgResponse = "Nessa vida só temos duas certezas: uma é que um dia todos nós iremos morrer, e a outra é que no final do ano tem show do Roberto Carlos.";
                        break;
                    case SIM:
                        msgResponse = "Concordo com você";
                        break;
                    case NAO:
                        msgResponse = "Tudo é uma questão de perspectiva \uD83D\uDE03";
                        break;
                    case RIR:
                        msgResponse = "sorria pois alguém pode se apaixonar pelo seu sorriso!";
                        break;
                    case PIADA:
                        msgResponse = "O que uma impressora falou pra outra???? - Esse papel é seu ou é IMPRESSÃO minha!!! \uD83D\uDE02 \uD83D\uDE02 \uD83D\uDE02";
                        break;
                    case OUTRA:
                        msgResponse = "Só fui programado para essa.\uD83D\uDE1E ";


                }

            }else
                cont++;
            if(cont >= OpcoesChat.values().length){
                msgResponse = "Não entendi... \uD83E\uDD28";
                break;
            }
        }

        return msgResponse;
    }
}
