package com.Mehemmed.CourseSystem.Controller;
import com.Mehemmed.CourseSystem.Model.Base.BaseResponse;
import com.Mehemmed.CourseSystem.Model.mappers.GroupEntityMapper;
import com.Mehemmed.CourseSystem.Model.payload.group.GroupPayload;
import com.Mehemmed.CourseSystem.services.group.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/groups")
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;

    // todo validation
    @PostMapping
    public BaseResponse<Void> addGroup (@RequestBody GroupPayload groupPayload){
        groupService.insert(GroupEntityMapper.INSTANCE.toEntity(groupPayload));
        return BaseResponse.success();
    }

    // todo validation
    @PutMapping("/{id}")
    public BaseResponse<Void> updateGroup (@PathVariable("id") long id, @RequestBody GroupPayload groupPayload) {
        groupService.update(GroupEntityMapper.INSTANCE.toEntity(groupPayload, id));
        return BaseResponse.success();
    }
}