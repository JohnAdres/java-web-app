package com.jsf;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Nov 16, 2016
 */
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
// or import javax.inject.Named;
import javax.faces.bean.SessionScoped;
// or import javax.enterprise.context.SessionScoped;


@ManagedBean(name = "formEducation")
@SessionScoped

public class Educations implements Serializable {

     private Education education = Education.HIGH_SCHOOL;

     public enum Education {
          HIGH_SCHOOL, BACHELOR, MASTER, DOCTOR
     };

     public Education getEducation() {
          return education;
     }

     public void setEducation(Education newValue) {
          education = newValue;
     }

     public Map<String, Education> getEducationItems() {
          return educationItems;
     }

     private static final Map<String, Education> educationItems;

     static {
          educationItems = new LinkedHashMap<String, Education>();
          educationItems.put("High School", Education.HIGH_SCHOOL); // label, value
          educationItems.put("Bachelor's", Education.BACHELOR);
          educationItems.put("Master's", Education.MASTER);
          educationItems.put("Doctorate", Education.DOCTOR);
     }
;
}
