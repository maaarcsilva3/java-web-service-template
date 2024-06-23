http://localhost:8080/jaxrs-example/api/hello/welcome

/jaxrs-example   = context root

configure web.xml  location in C:\Users\Elizabeth\eclipse-workspace\testing\src\main\webapp\WEB-INF
		
		<?xml version="1.0" encoding="UTF-8"?>
		<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
		         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd"
		         version="3.1">
		
		    <display-name>JAX-RS Example</display-name>
		
		    <servlet>
		        <servlet-name>javax.ws.rs.core.Application</servlet-name>
		        <servlet-class>org.glassfish.jersey.servlet.ServletContainer</servlet-class>
		        <init-param>
		            <param-name>jersey.config.server.provider.packages</param-name>
		            <param-value>com.example.rest</param-value>
		        </init-param>
		        <load-on-startup>1</load-on-startup>
		    </servlet>
		
		    <servlet-mapping>
		        <servlet-name>javax.ws.rs.core.Application</servlet-name>
		        <url-pattern>/api/*</url-pattern>
		    </servlet-mapping>
		</web-app>
		
important parts
	  <url-pattern>/api/*</url-pattern>  this is part of the url 
