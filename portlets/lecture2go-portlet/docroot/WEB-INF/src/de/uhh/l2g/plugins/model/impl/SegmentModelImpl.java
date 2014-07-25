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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import de.uhh.l2g.plugins.model.Segment;
import de.uhh.l2g.plugins.model.SegmentModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Segment service. Represents a row in the &quot;LG_Segment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link de.uhh.l2g.plugins.model.SegmentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SegmentImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see SegmentImpl
 * @see de.uhh.l2g.plugins.model.Segment
 * @see de.uhh.l2g.plugins.model.SegmentModel
 * @generated
 */
public class SegmentModelImpl extends BaseModelImpl<Segment>
	implements SegmentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a segment model instance should use the {@link de.uhh.l2g.plugins.model.Segment} interface instead.
	 */
	public static final String TABLE_NAME = "LG_Segment";
	public static final Object[][] TABLE_COLUMNS = {
			{ "segmentId", Types.INTEGER },
			{ "videoId", Types.INTEGER },
			{ "start_", Types.VARCHAR },
			{ "title", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "end_", Types.VARCHAR },
			{ "chapter", Types.VARCHAR },
			{ "userId", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table LG_Segment (segmentId INTEGER not null primary key,videoId INTEGER,start_ VARCHAR(75) null,title VARCHAR(75) null,description VARCHAR(75) null,end_ VARCHAR(75) null,chapter VARCHAR(75) null,userId INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table LG_Segment";
	public static final String ORDER_BY_JPQL = " ORDER BY segment.segmentId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY LG_Segment.segmentId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.de.uhh.l2g.plugins.model.Segment"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.de.uhh.l2g.plugins.model.Segment"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.de.uhh.l2g.plugins.model.Segment"));

	public SegmentModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _segmentId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setSegmentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _segmentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Segment.class;
	}

	@Override
	public String getModelClassName() {
		return Segment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("segmentId", getSegmentId());
		attributes.put("videoId", getVideoId());
		attributes.put("start", getStart());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("end", getEnd());
		attributes.put("chapter", getChapter());
		attributes.put("userId", getUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer segmentId = (Integer)attributes.get("segmentId");

		if (segmentId != null) {
			setSegmentId(segmentId);
		}

		Integer videoId = (Integer)attributes.get("videoId");

		if (videoId != null) {
			setVideoId(videoId);
		}

		String start = (String)attributes.get("start");

		if (start != null) {
			setStart(start);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String end = (String)attributes.get("end");

		if (end != null) {
			setEnd(end);
		}

		String chapter = (String)attributes.get("chapter");

		if (chapter != null) {
			setChapter(chapter);
		}

		Integer userId = (Integer)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}
	}

	@Override
	public int getSegmentId() {
		return _segmentId;
	}

	@Override
	public void setSegmentId(int segmentId) {
		_segmentId = segmentId;
	}

	@Override
	public int getVideoId() {
		return _videoId;
	}

	@Override
	public void setVideoId(int videoId) {
		_videoId = videoId;
	}

	@Override
	public String getStart() {
		if (_start == null) {
			return StringPool.BLANK;
		}
		else {
			return _start;
		}
	}

	@Override
	public void setStart(String start) {
		_start = start;
	}

	@Override
	public String getTitle() {
		if (_title == null) {
			return StringPool.BLANK;
		}
		else {
			return _title;
		}
	}

	@Override
	public void setTitle(String title) {
		_title = title;
	}

	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public String getEnd() {
		if (_end == null) {
			return StringPool.BLANK;
		}
		else {
			return _end;
		}
	}

	@Override
	public void setEnd(String end) {
		_end = end;
	}

	@Override
	public String getChapter() {
		if (_chapter == null) {
			return StringPool.BLANK;
		}
		else {
			return _chapter;
		}
	}

	@Override
	public void setChapter(String chapter) {
		_chapter = chapter;
	}

	@Override
	public int getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(int userId) {
		_userId = userId;
	}

	@Override
	public Segment toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Segment)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SegmentImpl segmentImpl = new SegmentImpl();

		segmentImpl.setSegmentId(getSegmentId());
		segmentImpl.setVideoId(getVideoId());
		segmentImpl.setStart(getStart());
		segmentImpl.setTitle(getTitle());
		segmentImpl.setDescription(getDescription());
		segmentImpl.setEnd(getEnd());
		segmentImpl.setChapter(getChapter());
		segmentImpl.setUserId(getUserId());

		segmentImpl.resetOriginalValues();

		return segmentImpl;
	}

	@Override
	public int compareTo(Segment segment) {
		int primaryKey = segment.getPrimaryKey();

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

		if (!(obj instanceof Segment)) {
			return false;
		}

		Segment segment = (Segment)obj;

		int primaryKey = segment.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Segment> toCacheModel() {
		SegmentCacheModel segmentCacheModel = new SegmentCacheModel();

		segmentCacheModel.segmentId = getSegmentId();

		segmentCacheModel.videoId = getVideoId();

		segmentCacheModel.start = getStart();

		String start = segmentCacheModel.start;

		if ((start != null) && (start.length() == 0)) {
			segmentCacheModel.start = null;
		}

		segmentCacheModel.title = getTitle();

		String title = segmentCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			segmentCacheModel.title = null;
		}

		segmentCacheModel.description = getDescription();

		String description = segmentCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			segmentCacheModel.description = null;
		}

		segmentCacheModel.end = getEnd();

		String end = segmentCacheModel.end;

		if ((end != null) && (end.length() == 0)) {
			segmentCacheModel.end = null;
		}

		segmentCacheModel.chapter = getChapter();

		String chapter = segmentCacheModel.chapter;

		if ((chapter != null) && (chapter.length() == 0)) {
			segmentCacheModel.chapter = null;
		}

		segmentCacheModel.userId = getUserId();

		return segmentCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{segmentId=");
		sb.append(getSegmentId());
		sb.append(", videoId=");
		sb.append(getVideoId());
		sb.append(", start=");
		sb.append(getStart());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", end=");
		sb.append(getEnd());
		sb.append(", chapter=");
		sb.append(getChapter());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("de.uhh.l2g.plugins.model.Segment");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>segmentId</column-name><column-value><![CDATA[");
		sb.append(getSegmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>videoId</column-name><column-value><![CDATA[");
		sb.append(getVideoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>start</column-name><column-value><![CDATA[");
		sb.append(getStart());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>end</column-name><column-value><![CDATA[");
		sb.append(getEnd());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chapter</column-name><column-value><![CDATA[");
		sb.append(getChapter());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Segment.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Segment.class
		};
	private int _segmentId;
	private int _videoId;
	private String _start;
	private String _title;
	private String _description;
	private String _end;
	private String _chapter;
	private int _userId;
	private Segment _escapedModel;
}