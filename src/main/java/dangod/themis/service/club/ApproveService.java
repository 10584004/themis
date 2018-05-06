package dangod.themis.service.club;

import dangod.themis.model.vo.club.ApprovalVo;

import java.util.List;

public interface ApproveService {
    /**
     * 通过申请Id获取全部审核结果
     * @param applicationId
     * @return
     */
    List<ApprovalVo> getApprovalVoListById(long applicationId);

    /**
     * 审批表单
     * @param applicationId
     * @param userId
     * @param result 1同意 0不同意
     * @param comment
     * @return
     */
    ApprovalVo approve(long applicationId, long userId, Integer result, String comment);//用role 确定审批等级
}
