package com.ruoyi.system.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class HomePages implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    //测试改代码
    private String clientId;

    private String headUrl;

    private String coverUrl;

    private String title;

    private String logoUrl;

    private String aboutUsInfo;

    private String aboutUsImgUrl;

    private Integer status;

    private String companyName;

    private String companyQrUrl;

    private String companyPhone;

    private String companyEmail;

    private String icpInfo;

    private String consultUrl;

    private String createdAt;

    private String updatedAt;

}
