package org.shop.mapper;

import org.shop.domain.CodeGroup;

import java.util.List;

public interface CodeGroupMapper {

    public void create(CodeGroup codeGroup) throws Exception;

    public List<CodeGroup> list() throws Exception;

    public CodeGroup read(String groupCode) throws Exception;
}
