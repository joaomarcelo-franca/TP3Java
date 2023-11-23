package br.com.infnet.LogsUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logs {
    public static void main(String[] args) {
        Logger LOGGER = LoggerFactory.getLogger(Logs.class);
        LOGGER.info("Iniciando a Main!");

        try{
            LOGGER.debug("Comecando Divisao");
            LOGGER.debug("Divindo 10 por 2: " + 10/2);
            LOGGER.debug("Divindo 10 por 0: " + 10/0);
        } catch (Exception ex){
            LOGGER.error("situacao de erro " + ex.getMessage());
        }

    }
}
