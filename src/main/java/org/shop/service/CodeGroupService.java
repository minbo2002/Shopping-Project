package org.shop.service;

import org.shop.domain.CodeGroup;

import java.util.List;

public interface CodeGroupService {

    public void register(CodeGroup codeGroup) throws Exception;

    public List<CodeGroup> list() throws Exception;

    public CodeGroup read(String groupCode) throws Exception;

    public void modify(CodeGroup codeGroup) throws Exception;

    public void delete(String groupCode) throws Exception;
}
