package com.frs.util;

import com.frs.domain.Result;

public class ResultUtil {

    public static Result success(Object obejct) {
        Result result = new Result();
        result.setCode(0);
        result.setMeg("成功");
        result.setData(obejct);
        return result;
    }

    public Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMeg(msg);
        return result;
    }
}
