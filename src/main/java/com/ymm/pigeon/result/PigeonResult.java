package com.ymm.pigeon.result;

import com.ymm.pigeon.enums.PigeonEnum;

public class PigeonResult {

    private PigeonEnum resultCode;
    private String resultDesc;

    public boolean isPigeon(){
        return resultCode.getCode() == PigeonEnum.PIGEON.getCode();
    }

    public void setResultCode(PigeonEnum resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }
}
