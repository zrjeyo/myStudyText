package json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
/*JSON导包net.sf.json.JSONArray
 * 需要架包commons-beanutils-1.7.0.jar
   commons-collections-3.2.jar 
   commons-lang-2.4.jar 
   commons-logging-1.1.jar 
   ezmorph-1.0.4.jar 
   json-lib-2.2.2-jdk15.jar 
 */

public class JsonUse {
	/*
    List集合转换成json
   */  
	public JSONArray ListToJsonArray(){
		  List<Student> list=new ArrayList<Student>();
		 for(int i=0;i<3;i++){
			 Student stu=new Student(i,"张"+i,i*10+1);
			 list.add(stu);
		 }
		  JSONArray jsonArray=JSONArray.fromObject(list);
		  return jsonArray;
       }
	
	/*
   Map集合转换成json
      */
	public JSONObject MapToJsonObject(){
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("name", "json");
		map.put("bool", Boolean.TRUE);
		map.put("int", new Integer(1));
		map.put("arr", new String[]{"a","b"});
		map.put("func", "function(i){return this.arr[i];}");
		JSONObject jsonArray=JSONObject.fromObject(map);
		return jsonArray;
	}
    
	/*
     Bean转换成json
  */	
	public void BeanToJsonObject(){
		Student stu=new Student();
        stu.setAge(22);
        stu.setId(1011);
        stu.setName("张三");
        JSONObject jsonObject=JSONObject.fromObject(stu);
        System.out.println(jsonObject);     
	}
	
	/*
     数组转换成json
   */
	public void arrayToJson(){
		boolean[] boolArray=new boolean[]{true,false,true};
		JSONArray jsonArray=JSONArray.fromObject(boolArray);
		 System.out.println(jsonArray);
	}
	
   /*	
     一般数据转换成json
   */
	public void genToJson(){
		JSONArray jsonArray=JSONArray.fromObject("['json','is','esay']");	
		 System.out.println(jsonArray);
    }
	@SuppressWarnings("unchecked")
	public static void main(String args[]){
		JsonUse jsonUse=new JsonUse();
		JSONArray jsonArray=jsonUse.ListToJsonArray();//list转jsonArray
	    List<Student> list=(List<Student>)JSONArray.toCollection(jsonArray, Student.class);//jsonArray转list,or((List)JSONArray.toList(jsonArray, Student.class))
	    Iterator<Student> it=list.iterator();//Iterator遍历集合用
	    while(it.hasNext()){
	    	Student stu=(Student)it.next();
	    	System.out.println(stu.getAge()+stu.getName()+stu.getId());
	    } 

	}
	
	}
/*
 * 发送至前端getResponse().getWriter().write(jsonObject.toString());
 * 前台循环取
       $.each(date, function(i, obj) {
       $("#examName").append("<option value='" + obj.id + "'>"+ obj.value+ "</option>");
   });
*/
