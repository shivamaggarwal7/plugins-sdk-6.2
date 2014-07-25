/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package de.uhh.l2g.plugins.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import de.uhh.l2g.plugins.model.Segment_User_Video;
import de.uhh.l2g.plugins.model.Segment_User_VideoModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Segment_User_Video service. Represents a row in the &quot;LG_Segment_User_Video&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link de.uhh.l2g.plugins.model.Segment_User_VideoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Segment_User_VideoImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see Segment_User_VideoImpl
 * @see de.uhh.l2g.plugins.model.Segment_User_Video
 * @see de.uhh.l2g.plugins.model.Segment_User_VideoModel
 * @generated
 */
public class Segment_User_VideoModelImpl extends BaseModelImpl<Segment_User_Video>
	implements Segment_User_VideoModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a segment_ user_ video model instance should use the {@link de.uhh.l2g.plugins.model.Segment_User_Video} interface instead.
	 */
	public static final String TABLE_NAME = "LG_Segment_User_Video";
	public static final Object[][] TABLE_COLUMNS = {
			{ "segmentId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "videoId", Types.BIGINT },
			{ "segmentUserVideoId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table LG_Segment_User_Video (segmentId LONG,userId LONG,videoId LONG,segmentUserVideoId LONG not null primary key)";
	public static final String TABLE_SQL_DROP = "drop table LG_Segment_User_Video";
	public static final String ORDER_BY_JPQL = " ORDER BY segment_User_Video.segmentUserVideoId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY LG_Segment_User_Video.segmentUserVideoId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.de.uhh.l2g.plugins.model.Segment_User_Video"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.de.uhh.l2g.plugins.model.Segment_User_Video"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.de.uhh.l2g.plugins.model.Segment_User_Video"));

	public Segment_User_VideoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _segmentUserVideoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSegmentUserVideoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _segmentUserVideoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Segment_User_Video.class;
	}

	@Override
	public String getModelClassName() {
		return Segment_User_Video.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("segmentId", getSegmentId());
		attributes.put("userId", getUserId());
		attributes.put("videoId", getVideoId());
		attributes.put("segmentUserVideoId", getSegmentUserVideoId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long segmentId = (Long)attributes.get("segmentId");

		if (segmentId != null) {
			setSegmentId(segmentId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long videoId = (Long)attributes.get("videoId");

		if (videoId != null) {
			setVideoId(videoId);
		}

		Long segmentUserVideoId = (Long)attributes.get("segmentUserVideoId");

		if (segmentUserVideoId != null) {
			setSegmentUserVideoId(segmentUserVideoId);
		}
	}

	@Override
	public long getSegmentId() {
		return _segmentId;
	}

	@Override
	public void setSegmentId(long segmentId) {
		_segmentId = segmentId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public long getVideoId() {
		return _videoId;
	}

	@Override
	public void setVideoId(long videoId) {
		_videoId = videoId;
	}

	@Override
	public long getSegmentUserVideoId() {
		return _segmentUserVideoId;
	}

	@Override
	public void setSegmentUserVideoId(long segmentUserVideoId) {
		_segmentUserVideoId = segmentUserVideoId;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Segment_User_Video.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Segment_User_Video toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Segment_User_Video)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		Segment_User_VideoImpl segment_User_VideoImpl = new Segment_User_VideoImpl();

		segment_User_VideoImpl.setSegmentId(getSegmentId());
		segment_User_VideoImpl.setUserId(getUserId());
		segment_User_VideoImpl.setVideoId(getVideoId());
		segment_User_VideoImpl.setSegmentUserVideoId(getSegmentUserVideoId());

		segment_User_VideoImpl.resetOriginalValues();

		return segment_User_VideoImpl;
	}

	@Override
	public int compareTo(Segment_User_Video segment_User_Video) {
		long primaryKey = segment_User_Video.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Segment_User_Video)) {
			return false;
		}

		Segment_User_Video segment_User_Video = (Segment_User_Video)obj;

		long primaryKey = segment_User_Video.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Segment_User_Video> toCacheModel() {
		Segment_User_VideoCacheModel segment_User_VideoCacheModel = new Segment_User_VideoCacheModel();

		segment_User_VideoCacheModel.segmentId = getSegmentId();

		segment_User_VideoCacheModel.userId = getUserId();

		segment_User_VideoCacheModel.videoId = getVideoId();

		segment_User_VideoCacheModel.segmentUserVideoId = getSegmentUserVideoId();

		return segment_User_VideoCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{segmentId=");
		sb.append(getSegmentId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", videoId=");
		sb.append(getVideoId());
		sb.append(", segmentUserVideoId=");
		sb.append(getSegmentUserVideoId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("de.uhh.l2g.plugins.model.Segment_User_Video");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>segmentId</column-name><column-value><![CDATA[");
		sb.append(getSegmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>videoId</column-name><column-value><![CDATA[");
		sb.append(getVideoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>segmentUserVideoId</column-name><column-value><![CDATA[");
		sb.append(getSegmentUserVideoId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Segment_User_Video.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Segment_User_Video.class
		};
	private long _segmentId;
	private long _userId;
	private String _userUuid;
	private long _videoId;
	private long _segmentUserVideoId;
	private Segment_User_Video _escapedModel;
}