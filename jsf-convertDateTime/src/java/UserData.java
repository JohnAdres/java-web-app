
/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Nov 18, 2016
 */
import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "userData", eager = true)
@SessionScoped
public class UserData implements Serializable {

     //private static final long serialVersionUID = 1L;
     public Date date;

     public Date getDate() {
          return date;
     }

     public void setDate(Date date) {
          this.date = date;
     }
}
