/*
 * Copyright 2014 Ranjan Kumar
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.restfeel.dao.util;

import java.util.Date;

import com.restfeel.entity.User;
import com.restfeel.util.TreeNode;

public class TreeNodeBuilder {

    private TreeNodeBuilder() {}

    public static TreeNode createTreeNode(String nodeId, String nodeName, String nodeDesc, String workspaceId, String parentId, Long position, String nodeType, Boolean starred, String method, Date lastModifiedDate, User lastModifiedBy) {
	TreeNode treeNode = new TreeNode();
	treeNode.setId(nodeId);
	treeNode.setName(nodeName);
	treeNode.setDescription(nodeDesc);
	treeNode.setWorkspaceId(workspaceId);
	treeNode.setParentId(parentId);
	treeNode.setPosition(position);
	treeNode.setNodeType(nodeType);
	treeNode.setStarred(starred);
	treeNode.setMethod(method);
	treeNode.setLastModifiedDate(lastModifiedDate);
	treeNode.setLastModifiedBy(lastModifiedBy);
	return treeNode;
    }
}
