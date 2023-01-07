package com.ruoyi.common.enums;

public enum ReturnCode {
    SUCCESS("200", "success"),
    //用户模块
    REGISTER_FAIL("E10001", "用户名已存在！"),
    RESET_PASSWORD_FAIL("E10002", "重置用户密码失败！"),
    DELETE_USER_FAIL("E10003", "删除用户失败！"),
    PERMISSION_DENIED("E10004","没有操作权限！"),
    LOGIN_FAIL("E10005","用户名或密码错误！"),
    TRANSFER_ADMIN_FAIL("E10006","转移管理员失败！"),
    UPDATE_PASSWORD_FAIL("E10007", "修改用户密码失败！"),
    ADD_CONSUMTYPE_FAIL("E10008", "该类型已经存在！"),
    QUERY_CONSUMTYPE_FAIL("E10009", "搜索有误！"),
    UPDATE_CONSUMTYPE_FAIL("E10010", "您无权修改该类型！"),
    DELETE_CONSUMTYPE_FAIL("E10011", "删除该类型失败！"),

    //账单模块
    ADD_BILL_FAIL("E20001", "新增账单失败"),
    UPDATE_BILL_FAIL("E20002", "修改账单失败"),
    DELETE_BILL_FAIL("E20003", "删除账单失败"),
    UPDATE_BUDGET_FAIL("E20004", "设置预算失败");

    /**
     * 状态码
     */
    String code;

    /**
     * 状态信息
     */
    String msg;

    ReturnCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
