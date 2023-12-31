package com.fc.mini3server._core.handler;

public interface Message {
    String INVALID_ID_PARAMETER = "해당 아이디가 존재하지 않습니다.";
    String INVALID_SCHEDULE_PARAMETER = "등록된 일정이 존재하지 않습니다.";
    String INVALID_USER_STATUS_NOT_APPROVED = "미승인 상태의 계정만 승인 가능합니다.";
    String INVALID_USER_STATUS_APPROVED = "재직 중인 계정만 변경 가능합니다.";
    String METHOD_ARGUMENT_TYPE_MISMATCH = "유효하지 않은 파라미터입니다.";
    String NO_USER_DUTY_LEFT = "남은 당직 횟수가 없습니다.";
    String NO_USER_ANNUAL_LEFT = "남은 연차 횟수가 없습니다.";
    String ALREADY_EXISTS_ON_THAT_DATE = "해당 날짜에 이미 당직이 등록 되어있습니다.";
    String ALREADY_EXISTS_ON_THAT_DATE_ANNUAL = "해당 날짜에 이미 연차가 등록 되어있습니다. 취소 후 다시 신청해주세요";
    String ALREADY_EXISTS_CHANGE_DUTY_REQUEST = "이미 신청 중인 변경 건이 있습니다.";
    String ALREADY_EXISTS_CANCELED_ANNUAL = "이미 취소된 스케줄 입니다.";
    String NO_DUTY_SCHEDULE_ON_DATE = "바꾸려는 날짜에 당직이 없습니다.";
    String INVALID_DATE_RANGE = "시작일은 종료일보다 이전이거나 같아야 합니다.";
    String INVALID_EVALUATION_CANCELED = "취소된 연차는 수정할 수 없습니다.";
    String INVALID_SCHEDULE_EVALUATION = "미처리 된 건만 승인 가능합니다.";
    String INVALID_SCHEDULE_CATEGORY_NOT_DUTY = "당직 스케줄만 삭제 가능합니다.";
    String INVALID_SCHEDULE_CATEGORY_NOT_ANNUAL = "연차 스케줄만 삭제 가능합니다.";
    String INVALID_REGISTER_FORMAT = "요청 형식이 잘못 되었습니다. 올바른 직급, 병원, 또는 부서 번호를 입력 하였는지 확인하십시오.";
    String INVALID_CREATE_ANNUAL_FORMAT = "요청 형식이 잘못 되었습니다. 시작일, 종료일, 사유를 모두 입력 하였는지 확인하십시오.";
    String INVALID_USER_NOT_APPROVED = "인증되지 않은 사용자 입니다.";
    String INVALID_NOT_VALID_TOKEN = "올바른 토큰이 아닙니다.";
    String INVALID_NO_TOKEN_MATCHED_WITH_USER = "토큰 정보와 일치하는 회원이 없습니다.";
    String INVALID_PASSWORD = "입력하신 비밀번호가 일치하지 않습니다.";
    String HOSPITAL_NOT_FOUND = "존재하지 않는 병원입니다.";
    String DEPT_NOT_FOUND = "존재하지 않는 부서입니다.";
    String EXCEED_MAX_FILE_SIZE = "업로드한 이미지의 크기가 1MB를 초과합니다.";
    String IO_EXCEPTION_WHEN_FILE_UPLOADING = "이미지 파일 저장 중 문제가 발생했습니다.";
}
