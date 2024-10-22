package com.xunmaw.book.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.xunmaw.book.entity.LendList;

import java.util.Date;
import java.util.List;

public interface LendListService extends IService<LendList> {

    List<LendList> selectByReader(int id);

    List<LendList> selectByReader2(int id);

    void update1(int serNum, Date date);

    List<LendList> selectByReader3(int id);

    void update2(int serNum);

    void update3(int serNum, Date date);

    void update4(int serNum, Date date);

    Date getDate(int serNum);

    void updateDate(int serNum, Date date1);

    void updateFlag(int serNum);

    void updateFlag2(int serNum);

    List<LendList> select1();

    List<LendList> select2(int x);

    List<LendList> select3(String y);

    List<LendList> select4(int x, String y);


    void updateOne(int serNum);
}
