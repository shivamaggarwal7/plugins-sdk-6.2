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

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Videohitlist service. Represents a row in the &quot;LG_Videohitlist&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link de.uhh.l2g.plugins.model.impl.VideohitlistModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link de.uhh.l2g.plugins.model.impl.VideohitlistImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see Videohitlist
 * @see de.uhh.l2g.plugins.model.impl.VideohitlistImpl
 * @see de.uhh.l2g.plugins.model.impl.VideohitlistModelImpl
 * @generated
 */
public interface VideohitlistModel extends BaseModel<Videohitlist> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a videohitlist model instance should use the {@link Videohitlist} interface instead.
	 */

	/**
	 * Returns the primary key of this videohitlist.
	 *
	 * @return the primary key of this videohitlist
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this videohitlist.
	 *
	 * @param primaryKey the primary key of this videohitlist
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the videohitlist ID of this videohitlist.
	 *
	 * @return the videohitlist ID of this videohitlist
	 */
	public int getVideohitlistId();

	/**
	 * Sets the videohitlist ID of this videohitlist.
	 *
	 * @param videohitlistId the videohitlist ID of this videohitlist
	 */
	public void setVideohitlistId(int videohitlistId);

	/**
	 * Returns the hits per day of this videohitlist.
	 *
	 * @return the hits per day of this videohitlist
	 */
	public int getHitsPerDay();

	/**
	 * Sets the hits per day of this videohitlist.
	 *
	 * @param hitsPerDay the hits per day of this videohitlist
	 */
	public void setHitsPerDay(int hitsPerDay);

	/**
	 * Returns the hits per week of this videohitlist.
	 *
	 * @return the hits per week of this videohitlist
	 */
	public int getHitsPerWeek();

	/**
	 * Sets the hits per week of this videohitlist.
	 *
	 * @param hitsPerWeek the hits per week of this videohitlist
	 */
	public void setHitsPerWeek(int hitsPerWeek);

	/**
	 * Returns the hits per month of this videohitlist.
	 *
	 * @return the hits per month of this videohitlist
	 */
	public int getHitsPerMonth();

	/**
	 * Sets the hits per month of this videohitlist.
	 *
	 * @param hitsPerMonth the hits per month of this videohitlist
	 */
	public void setHitsPerMonth(int hitsPerMonth);

	/**
	 * Returns the hits per year of this videohitlist.
	 *
	 * @return the hits per year of this videohitlist
	 */
	public int getHitsPerYear();

	/**
	 * Sets the hits per year of this videohitlist.
	 *
	 * @param hitsPerYear the hits per year of this videohitlist
	 */
	public void setHitsPerYear(int hitsPerYear);

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
	public int compareTo(Videohitlist videohitlist);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Videohitlist> toCacheModel();

	@Override
	public Videohitlist toEscapedModel();

	@Override
	public Videohitlist toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}