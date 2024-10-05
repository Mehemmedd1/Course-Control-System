package com.Mehemmed.CourseSystem.Controller;
import com.Mehemmed.CourseSystem.Model.Base.BaseResponse;
import com.Mehemmed.CourseSystem.Model.payload.subject.SubjectPayload;
import com.Mehemmed.CourseSystem.services.subject.SubjectBusinessService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/subjects")
@RequiredArgsConstructor
public class SubjectController {
    private final SubjectBusinessService subjectBusinessService;

    @PostMapping
    public BaseResponse<Void> addSubject(@RequestBody SubjectPayload subjectPayload) {
        subjectBusinessService.insertSubject(subjectPayload);
        return BaseResponse.success();
    }

    @PutMapping("/{id}")
    public BaseResponse<Void> editSubject(@PathVariable("id") long id, @RequestBody SubjectPayload subjectPayload){
        subjectBusinessService.editSubject(id, subjectPayload);
        return BaseResponse.success();
    }
}