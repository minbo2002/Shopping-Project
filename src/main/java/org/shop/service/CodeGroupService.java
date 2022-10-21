package org.shop.service;

import org.shop.domain.CodeGroup;

import java.util.List;

public interface CodeGroupService {

    public void register(CodeGroup codeGroup) throws Exception;

    public List<CodeGroup> list() throws Exception;
}
