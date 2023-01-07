package com.ruoyi.web.controller.seller;

import com.ruoyi.system.param.CourseParam;
import com.ruoyi.system.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//@RequestMapping("/api")
@RestController
@CrossOrigin
public class APIController {

    @Autowired
    private CourseService courseService;

    //    get
//    http://localhost:8000/api/login/captcha?token = 123&phone=
//            "captcha-xxx"
    @GetMapping("/login/captcha")
    public Object queryCourse1(CourseParam param){

        return "captcha-xxx";
    }


//post
//    http://localhost:8000/api/login/account?token%20=%20123
//    {"status":"ok","type":"mobile","currentAuthority":"admin"}
    //添加课程基本信息
    @PostMapping("/login/account")
    public Object addCourse2(@RequestBody CourseParam param) {
        return "{\"status\":\"ok\",\"type\":\"mobile\",\"currentAuthority\":\"admin\"}";
    }

//    post
//    http://localhost:8000/api/login/outLogin?token%20=%20123
//    {"data":{},"success":true}
    @PostMapping("/login/outLogin")
    public Object addCourse3() {
        return "{\"data\":{},\"success\":true}";
    }



//    get
//    http://localhost:8000/api/currentUser?token%20=%20123
//    {"success":true,"data":{"name":"Serati Ma","avatar":"https://gw.alipayobjects.com/zos/antfincdn/XAosXuNZyF/BiazfanxmamNRoxxVxka.png","userid":"00000001","email":"antdesign@alipay.com","signature":"海纳百川，有容乃大","title":"交互专家","group":"蚂蚁金服－某某某事业群－某某平台部－某某技术部－UED","tags":[{"key":"0","label":"很有想法的"},{"key":"1","label":"专注设计"},{"key":"2","label":"辣~"},{"key":"3","label":"大长腿"},{"key":"4","label":"川妹子"},{"key":"5","label":"海纳百川"}],"notifyCount":12,"unreadCount":11,"country":"China","access":"admin","geographic":{"province":{"label":"浙江省","key":"330000"},"city":{"label":"杭州市","key":"330100"}},"address":"西湖区工专路 77 号","phone":"0752-268888888"}}
    //删除课程
    @GetMapping("/currentUser")
    public Object updateCourse4(){
        return "{\"success\":true,\"data\":{\"name\":\"Serati Ma\",\"avatar\":\"https://gw.alipayobjects.com/zos/antfincdn/XAosXuNZyF/BiazfanxmamNRoxxVxka.png\",\"userid\":\"00000001\",\"email\":\"antdesign@alipay.com\",\"signature\":\"海纳百川，有容乃大\",\"title\":\"交互专家\",\"group\":\"蚂蚁金服－某某某事业群－某某平台部－某某技术部－UED\",\"tags\":[{\"key\":\"0\",\"label\":\"很有想法的\"},{\"key\":\"1\",\"label\":\"专注设计\"},{\"key\":\"2\",\"label\":\"辣~\"},{\"key\":\"3\",\"label\":\"大长腿\"},{\"key\":\"4\",\"label\":\"川妹子\"},{\"key\":\"5\",\"label\":\"海纳百川\"}],\"notifyCount\":12,\"unreadCount\":11,\"country\":\"China\",\"access\":\"admin\",\"geographic\":{\"province\":{\"label\":\"浙江省\",\"key\":\"330000\"},\"city\":{\"label\":\"杭州市\",\"key\":\"330100\"}},\"address\":\"西湖区工专路 77 号\",\"phone\":\"0752-268888888\"}}";
    }



}
