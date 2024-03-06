package com.hongs.www.shoppingmall.member;

import lombok.*;

import java.time.OffsetDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberDto {
    private int mNo;
    private String mId;
    private String mPassWd;
    private String mName;
    private String mNickname;
    private String mEmail;
    private String mTell;
    private String mBirth;
    private OffsetDateTime mRegdate;
    private OffsetDateTime mWithdraw;
    private int mGrade;
    private int mState;

}
