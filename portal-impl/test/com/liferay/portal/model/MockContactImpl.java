/*
 * Copyright (c) 2000-2009 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portal.model;

import java.util.Date;

/**
 * <a href="MockContactImpl.java.html"><b><i>View Source</i></b></a>
 *
 * @author Michael C. Han
 */
public class MockContactImpl
	extends MockBaseModelImpl<Contact> implements Contact {

	public long getContactId() {
		return _contactId;
	}

	public void setContactId(long contactId) {
		_contactId = contactId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getAccountId() {
		return _accountId;
	}

	public void setAccountId(long accountId) {
		_accountId = accountId;
	}

	public long getParentContactId() {
		return _parentContactId;
	}

	public void setParentContactId(long parentContactId) {
		_parentContactId = parentContactId;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public String getMiddleName() {
		return _middleName;
	}

	public void setMiddleName(String middleName) {
		_middleName = middleName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public int getPrefixId() {
		return _prefixId;
	}

	public void setPrefixId(int prefixId) {
		_prefixId = prefixId;
	}

	public int getSuffixId() {
		return _suffixId;
	}

	public void setSuffixId(int suffixId) {
		_suffixId = suffixId;
	}

	public boolean isMale() {
		return _male;
	}

	public void setMale(boolean male) {
		_male = male;
	}

	public Date getBirthday() {
		return _birthday;
	}

	public void setBirthday(Date birthday) {
		_birthday = birthday;
	}

	public String getSmsSn() {
		return _smsSn;
	}

	public void setSmsSn(String smsSn) {
		_smsSn = smsSn;
	}

	public String getAimSn() {
		return _aimSn;
	}

	public void setAimSn(String aimSn) {
		_aimSn = aimSn;
	}

	public String getFacebookSn() {
		return _facebookSn;
	}

	public void setFacebookSn(String facebookSn) {
		_facebookSn = facebookSn;
	}

	public String getIcqSn() {
		return _icqSn;
	}

	public void setIcqSn(String icqSn) {
		_icqSn = icqSn;
	}

	public String getJabberSn() {
		return _jabberSn;
	}

	public void setJabberSn(String jabberSn) {
		_jabberSn = jabberSn;
	}

	public String getMsnSn() {
		return _msnSn;
	}

	public void setMsnSn(String msnSn) {
		_msnSn = msnSn;
	}

	public String getMySpaceSn() {
		return _mySpaceSn;
	}

	public void setMySpaceSn(String mySpaceSn) {
		_mySpaceSn = mySpaceSn;
	}

	public String getSkypeSn() {
		return _skypeSn;
	}

	public void setSkypeSn(String skypeSn) {
		_skypeSn = skypeSn;
	}

	public String getTwitterSn() {
		return _twitterSn;
	}

	public void setTwitterSn(String twitterSn) {
		_twitterSn = twitterSn;
	}

	public String getYmSn() {
		return _ymSn;
	}

	public void setYmSn(String ymSn) {
		_ymSn = ymSn;
	}

	public String getEmployeeStatusId() {
		return _employeeStatusId;
	}

	public void setEmployeeStatusId(String employeeStatusId) {
		_employeeStatusId = employeeStatusId;
	}

	public String getEmployeeNumber() {
		return _employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		_employeeNumber = employeeNumber;
	}

	public String getJobTitle() {
		return _jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		_jobTitle = jobTitle;
	}

	public String getJobClass() {
		return _jobClass;
	}

	public void setJobClass(String jobClass) {
		_jobClass = jobClass;
	}

	public String getHoursOfOperation() {
		return _hoursOfOperation;
	}

	public void setHoursOfOperation(String hoursOfOperation) {
		_hoursOfOperation = hoursOfOperation;
	}

	public String getFullName() {
		return _firstName + " " + _middleName + " " + _lastName;
	}

	public long getPrimaryKey() {
		return 0;
	}

	public void setPrimaryKey(long pk) {
		
	}

	public boolean getMale() {
		return isMale();
	}

	public Contact toEscapedModel() {
		return null;
	}

	private long _contactId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _accountId;
	private long _parentContactId;
	private String _firstName;
	private String _middleName;
	private String _lastName;
	private int _prefixId;
	private int _suffixId;
	private boolean _male;
	private Date _birthday;
	private String _smsSn;
	private String _aimSn;
	private String _facebookSn;
	private String _icqSn;
	private String _jabberSn;
	private String _msnSn;
	private String _mySpaceSn;
	private String _skypeSn;
	private String _twitterSn;
	private String _ymSn;
	private String _employeeStatusId;
	private String _employeeNumber;
	private String _jobTitle;
	private String _jobClass;
	private String _hoursOfOperation;

}
