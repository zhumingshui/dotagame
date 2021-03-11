package com.zms.dotagame.pojo;

import lombok.Data;

/*
* 用户储存/提取钥匙
* */
@Data
public class UserSaveAndOutKey {
    private String steam_id;
    private String limit;
    private String change;
    private String keyIndex;
    private String key1;
}
