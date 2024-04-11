package com.s1410.calme.Domain.Services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.s1410.calme.Domain.Dtos.whatsapp.MessageBodyDTO;
import com.s1410.calme.Domain.Dtos.whatsapp.ResponseWhatsapp;

public interface ApiWhatsappService {

    public ResponseWhatsapp sendMessage(MessageBodyDTO payload) throws JsonProcessingException;

}