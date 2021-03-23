package com.kolektor.dc.wsrestdcintegracion.utiles.conversores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.text.MessageFormat;
import java.util.Locale;

@Component
public class Mensajes {
    @Autowired
    private MessageSource messageSource;
    private MessageSourceAccessor accessor;

    @PostConstruct
    private void init() {
        accessor = new MessageSourceAccessor(messageSource, new Locale("es"));
    }

    public String get(String code) {
        return accessor.getMessage(code);
    }

    public String get(String code, Object[] params) {
        return MessageFormat.format(accessor.getMessage(code), params);
    }
}
