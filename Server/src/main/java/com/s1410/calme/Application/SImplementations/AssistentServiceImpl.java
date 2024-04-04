package com.s1410.calme.Application.SImplementations;

import com.s1410.calme.Domain.Dtos.request.RequestCreateAssistent;
import com.s1410.calme.Domain.Dtos.request.RequestEditAssistent;
import com.s1410.calme.Domain.Dtos.response.ResponseAssistent;
import com.s1410.calme.Domain.Mapper.AssistentMapper;
import com.s1410.calme.Domain.Repositories.AssistentRepository;
import com.s1410.calme.Domain.Services.AssistentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AssistentServiceImpl implements AssistentService {
    private final AssistentMapper assistentMapper;
    private final AssistentRepository assistentRepository;

    @Transactional
    @Override
    public ResponseAssistent createAssistent(RequestCreateAssistent requestCreateAssistent) {
        return null;
    }

    @Override
    public ResponseAssistent readAssistent(Long id) {
        return null;
    }

    @Override
    public List<ResponseAssistent> readAllAsistents() {
        return null;
    }

    @Transactional
    @Override
    public ResponseAssistent updateAssisten(RequestEditAssistent requestEditAssistent) {
        return null;
    }

    @Transactional
    @Override
    public Boolean deleteAssistent(Long id) {
        return null;
    }
}