package cn.kgc.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.kgc.pojo.TieBa;
import cn.kgc.pojo.User;
import cn.kgc.service.ITieBaService;
import cn.kgc.service.IUserService;

/**
 * 用户请控制层
 * @author chenzhihao
 * @author ADMIN
 * 2020年7月31日上午11:43:30
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;
	
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String loginUser(User user,HttpSession session) {
		User users=userService.loginUser(user);
		
		System.out.println(users);
		if(users == null) {
			session.setAttribute("loginError", "对不起！登陆失败！");
			return "forward:/login.jsp";
		}
		
		session.setAttribute("user", users);
		return "forward:/tieba/tiebapost";
	}
	
	/**
	 * 用户注册
	 * @author chenzhihao
	 * @author ADMIN
	 * 2020年7月31日下午2:02:54
	 * @param user
	 * @return
	 */
	 
	@RequestMapping(value="/register" ,method=RequestMethod.POST)
	public String registerUser(User user,HttpSession session) {
		user.setUserId(UUID.randomUUID().toString().replace("-", ""));
		System.out.println(user);
		boolean flage =  userService.saveUser(user);
		if(flage == false) {
			session.setAttribute("registerError", "用户注册失败");
			throw new RuntimeException("对不起！用户注册失败！");
		}
		   
		return  "forward:/login.jsp";
	}
	
}
