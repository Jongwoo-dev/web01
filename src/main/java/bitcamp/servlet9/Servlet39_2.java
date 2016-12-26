/* 주제: HttpSession 보관소 사용하기
 * => 서블릿이 다르더라도 기존에 세션 객체가 있다면 그 객체를 사용한다. 
 */
package bitcamp.servlet9;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet/servlet39_2")
public class Servlet39_2 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    // 웹브라우저가 세션 아이디를 쿠키로 보내지 않았으면, 
    // 새로 HttpSession 객체를 만들어 리턴한다.
    // 만약 웹 브라우저가 세션 아이디를 보냈으면,
    // 해당 HttpSession 객체를 찾아 리턴한다.
    HttpSession session = request.getSession();
    
        
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.printf("세션 아이디: %s\n", session.getId());
    
    Calendar cal = Calendar.getInstance();
    cal.setTimeInMillis(session.getCreationTime());
    out.printf("세션 생성시간: %s:%s:%s\n", 
        cal.get(Calendar.HOUR), 
        cal.get(Calendar.MINUTE), 
        cal.get(Calendar.SECOND));
    
//    out.printf("", session.get);
  }
}