package org.shop.service;

import lombok.RequiredArgsConstructor;
import org.shop.domain.CodeGroup;
import org.shop.mapper.CodeGroupMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CodeGroupServiceImpl implements CodeGroupService {

    private final CodeGroupMapper mapper;

    @Override
    public void register(CodeGroup codeGroup) throws Exception {
        mapper.create(codeGroup);
    }

    @Override
    public List<CodeGroup> list() throws Exception {
        return mapper.list();
    }

    @Override
    public CodeGroup read(String groupCode) throws Exception {
        return mapper.read(groupCode);
    }

    @Override
    public void modify(CodeGroup codeGroup) throws Exception {
        mapper.update(codeGroup);
    }

    @Override
    public void delete(String groupCode) throws Exception {
        mapper.delete(groupCode);
    }
}
