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

package de.uhh.l2g.plugins.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Metadata service. Represents a row in the &quot;LG_Metadata&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link de.uhh.l2g.plugins.model.impl.MetadataModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link de.uhh.l2g.plugins.model.impl.MetadataImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see Metadata
 * @see de.uhh.l2g.plugins.model.impl.MetadataImpl
 * @see de.uhh.l2g.plugins.model.impl.MetadataModelImpl
 * @generated
 */
public interface MetadataModel extends BaseModel<Metadata> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a metadata model instance should use the {@link Metadata} interface instead.
	 */

	/**
	 * Returns the primary key of this metadata.
	 *
	 * @return the primary key of this metadata
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this metadata.
	 *
	 * @param primaryKey the primary key of this metadata
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the metadata ID of this metadata.
	 *
	 * @return the metadata ID of this metadata
	 */
	public long getMetadataId();

	/**
	 * Sets the metadata ID of this metadata.
	 *
	 * @param metadataId the metadata ID of this metadata
	 */
	public void setMetadataId(long metadataId);

	/**
	 * Returns the u r l i d of this metadata.
	 *
	 * @return the u r l i d of this metadata
	 */
	@AutoEscape
	public String getURLID();

	/**
	 * Sets the u r l i d of this metadata.
	 *
	 * @param URLID the u r l i d of this metadata
	 */
	public void setURLID(String URLID);

	/**
	 * Returns the format of this metadata.
	 *
	 * @return the format of this metadata
	 */
	@AutoEscape
	public String getFormat();

	/**
	 * Sets the format of this metadata.
	 *
	 * @param format the format of this metadata
	 */
	public void setFormat(String format);

	/**
	 * Returns the type of this metadata.
	 *
	 * @return the type of this metadata
	 */
	@AutoEscape
	public String getType();

	/**
	 * Sets the type of this metadata.
	 *
	 * @param type the type of this metadata
	 */
	public void setType(String type);

	/**
	 * Returns the language of this metadata.
	 *
	 * @return the language of this metadata
	 */
	@AutoEscape
	public String getLanguage();

	/**
	 * Sets the language of this metadata.
	 *
	 * @param language the language of this metadata
	 */
	public void setLanguage(String language);

	/**
	 * Returns the title of this metadata.
	 *
	 * @return the title of this metadata
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this metadata.
	 *
	 * @param title the title of this metadata
	 */
	public void setTitle(String title);

	/**
	 * Returns the subject of this metadata.
	 *
	 * @return the subject of this metadata
	 */
	@AutoEscape
	public String getSubject();

	/**
	 * Sets the subject of this metadata.
	 *
	 * @param subject the subject of this metadata
	 */
	public void setSubject(String subject);

	/**
	 * Returns the coverage of this metadata.
	 *
	 * @return the coverage of this metadata
	 */
	@AutoEscape
	public String getCoverage();

	/**
	 * Sets the coverage of this metadata.
	 *
	 * @param coverage the coverage of this metadata
	 */
	public void setCoverage(String coverage);

	/**
	 * Returns the description of this metadata.
	 *
	 * @return the description of this metadata
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this metadata.
	 *
	 * @param description the description of this metadata
	 */
	public void setDescription(String description);

	/**
	 * Returns the creator of this metadata.
	 *
	 * @return the creator of this metadata
	 */
	@AutoEscape
	public String getCreator();

	/**
	 * Sets the creator of this metadata.
	 *
	 * @param creator the creator of this metadata
	 */
	public void setCreator(String creator);

	/**
	 * Returns the publisher of this metadata.
	 *
	 * @return the publisher of this metadata
	 */
	@AutoEscape
	public String getPublisher();

	/**
	 * Sets the publisher of this metadata.
	 *
	 * @param publisher the publisher of this metadata
	 */
	public void setPublisher(String publisher);

	/**
	 * Returns the contributor of this metadata.
	 *
	 * @return the contributor of this metadata
	 */
	@AutoEscape
	public String getContributor();

	/**
	 * Sets the contributor of this metadata.
	 *
	 * @param contributor the contributor of this metadata
	 */
	public void setContributor(String contributor);

	/**
	 * Returns the rights holder of this metadata.
	 *
	 * @return the rights holder of this metadata
	 */
	@AutoEscape
	public String getRightsHolder();

	/**
	 * Sets the rights holder of this metadata.
	 *
	 * @param rightsHolder the rights holder of this metadata
	 */
	public void setRightsHolder(String rightsHolder);

	/**
	 * Returns the rights of this metadata.
	 *
	 * @return the rights of this metadata
	 */
	@AutoEscape
	public String getRights();

	/**
	 * Sets the rights of this metadata.
	 *
	 * @param rights the rights of this metadata
	 */
	public void setRights(String rights);

	/**
	 * Returns the provenance of this metadata.
	 *
	 * @return the provenance of this metadata
	 */
	@AutoEscape
	public String getProvenance();

	/**
	 * Sets the provenance of this metadata.
	 *
	 * @param provenance the provenance of this metadata
	 */
	public void setProvenance(String provenance);

	/**
	 * Returns the source of this metadata.
	 *
	 * @return the source of this metadata
	 */
	@AutoEscape
	public String getSource();

	/**
	 * Sets the source of this metadata.
	 *
	 * @param source the source of this metadata
	 */
	public void setSource(String source);

	/**
	 * Returns the relation of this metadata.
	 *
	 * @return the relation of this metadata
	 */
	@AutoEscape
	public String getRelation();

	/**
	 * Sets the relation of this metadata.
	 *
	 * @param relation the relation of this metadata
	 */
	public void setRelation(String relation);

	/**
	 * Returns the audience of this metadata.
	 *
	 * @return the audience of this metadata
	 */
	@AutoEscape
	public String getAudience();

	/**
	 * Sets the audience of this metadata.
	 *
	 * @param audience the audience of this metadata
	 */
	public void setAudience(String audience);

	/**
	 * Returns the instructional methods of this metadata.
	 *
	 * @return the instructional methods of this metadata
	 */
	@AutoEscape
	public String getInstructionalMethods();

	/**
	 * Sets the instructional methods of this metadata.
	 *
	 * @param instructionalMethods the instructional methods of this metadata
	 */
	public void setInstructionalMethods(String instructionalMethods);

	/**
	 * Returns the date of this metadata.
	 *
	 * @return the date of this metadata
	 */
	public Date getDate();

	/**
	 * Sets the date of this metadata.
	 *
	 * @param date the date of this metadata
	 */
	public void setDate(Date date);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Metadata metadata);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Metadata> toCacheModel();

	@Override
	public Metadata toEscapedModel();

	@Override
	public Metadata toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}