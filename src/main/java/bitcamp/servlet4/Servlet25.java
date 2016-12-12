/* 주제: GET과 POST를 구분하여 요청 처리 III
 * AbstractHttpServlet 클래스를 상속 받아서 요청을 처리한다.
 * => servlet/servlet25.html로 테스트한다.
 */
package bitcamp.servlet4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet25")
public class Servlet25 extends AbstractHttpServlet {
  private static final long serialVersionUID = 1L;
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // 이렇게 AbstractHttpServlet 클래스에 추가된 Service() 메서드를 재정의하면
    // 오리지널 service를 구현하는 것 보다 편하다.
    // 어떤 점에서? 파라미터를 HttpServletRequest와 HttpServletResponse로
    // 형변환할 필요가 없다.
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("요청 처리");
  }
}
