package com.burhan.kodluyoruzBitirmeMyBank.common;

import org.modelmapper.ModelMapper;

public interface ModelMapperService {
    ModelMapper forResponse();
    ModelMapper forRequest();
}
