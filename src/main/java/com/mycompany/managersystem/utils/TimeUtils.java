/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.managersystem.utils;

import java.sql.Timestamp;

/**
 *
 * @author jason email: 765798166@qq.com
 * @date 2018-3-8 11:32:32
 */
public class TimeUtils {

    public static Timestamp getNowTimestamp() {
        return new Timestamp(System.currentTimeMillis());
    }
}
