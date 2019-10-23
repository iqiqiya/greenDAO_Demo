package iqiqiya.lanlana.greendao_demo;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import org.greenrobot.greendao.database.Database;

import iqiqiya.lanlana.greendao_demo.model.DaoMaster;
import iqiqiya.lanlana.greendao_demo.model.DaoSession;

/**
 * Author: iqiqiya
 * Date: 2019/10/22
 * Time: 15:56
 * Blog: blog.77sec.cn
 * Github: github.com/iqiqiya
 */
public class MyApplication extends Application {


    public static DaoSession mSession;

    @Override
    public void onCreate() {
        super.onCreate();

        initDb();
    }

    /**
     * 连接数据库并创建会话
     */

    public void initDb(){
        //1.获取需要连接的数据库
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(this,"akie2.db");
        //SQLiteDatabase db = devOpenHelper.getWritableDatabase();
        Database database = devOpenHelper.getEncryptedReadableDb("123456");//无法对已经存在的数据库做加密
        //2.创建数据库链接
        DaoMaster daoMaster = new DaoMaster(database);
        //3.创建数据库会话
        mSession = daoMaster.newSession();
    }
}
