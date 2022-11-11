package com.edu.qt.controller;

import com.edu.qt.dto.QAInternProjectDTO;
import com.edu.qt.service.QAInternProjectService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class QAInternProjectController {


    @Autowired
    QAInternProjectService qaInternProjectServiceService;
    // @Autowired
    ModelMapper modelMapper = new ModelMapper();

    @GetMapping(value = "/QAInternProject/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<QAInternProjectDTO> fetchAllQAInternProject() {
        List<com.edu.qt.model.QAInternProject> qaInternProjectList = (List<com.edu.qt.model.QAInternProject>)qaInternProjectServiceService.fetchAllQAInternProject();

        List<QAInternProjectDTO> qaInternProjectDTOS = Arrays.asList(modelMapper.map(qaInternProjectList, QAInternProjectDTO[].class));
        return qaInternProjectDTOS;
    }


}/*user/create],methods=[POST],produces=[application/json]}" onto public org.springframework.http.ResponseEntity<java.lang.String> com.edu.qt.controller.UserController.createUser(com.edu.qt.dto.UserDTO)
        2022-11-10 15:45:13.600  INFO 12888 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
        2022-11-10 15:45:13.600  INFO 12888 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
        2022-11-10 15:45:13.625  INFO 12888 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars*//**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
 2022-11-10 15:45:13.625  INFO 12888 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
 2022-11-10 15:45:13.652  INFO 12888 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**//*favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
        2022-11-10 15:45:13.845  INFO 12888 --- [           main] o.s.j.e.a.AnnotationMBeanExporter*/