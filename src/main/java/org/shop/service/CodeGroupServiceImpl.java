package org.shop.service;

import lombok.RequiredArgsConstructor;
import org.shop.mapper.CodeGroupMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CodeGroupServiceImpl implements CodeGroupService {

    private final CodeGroupMapper mapper;
}
