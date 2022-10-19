package org.shop.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDateTime;

@Getter @Setter
@ToString
public class CodeGroup {

    private String groupCode;
    private String groupName;
    private String useYn;
    private LocalDateTime regDate;
    private LocalDateTime updDate;
}
