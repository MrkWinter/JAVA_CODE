package com.mrkwinter.dao.test;

import com.mrkwinter.dao.dao.ActorDAO;
import com.mrkwinter.dao.domain.Actor;

import java.util.List;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class ActorUse {
    public static void main(String[] args) {
        //多行多列查询
        ActorDAO actorDAO = new ActorDAO();
        List<Actor> actors = actorDAO.quarryMulti("select * from actor where id > ?", Actor.class, 0);
        System.out.println("多行多列数据" + actors);

        //单行多列数据
        Actor actor = actorDAO.quarrySingle("select * from actor where id = ?", Actor.class, 1);
        System.out.println("单行多列数据" + actor);

        //单行单列数据
        Object o = actorDAO.quarryScn("select name from actor where id = ?", 1);
        System.out.println("单行但列数据" + o);

        //插入数据操作
        int affectedRow = actorDAO.updateSql("insert into actor values(null,?,?)", "范冰冰", 1000);
        if (affectedRow>0)
            System.out.println("插入成功");
    }
}
