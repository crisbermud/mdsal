/*
 * Copyright (c) 2017 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.mdsal.binding.javav2.generator.util;

import javax.management.NotificationListener;
import org.opendaylight.mdsal.binding.javav2.model.api.ConcreteType;
import org.opendaylight.mdsal.binding.javav2.model.api.ParameterizedType;
import org.opendaylight.mdsal.binding.javav2.model.api.Type;
import org.opendaylight.mdsal.binding.javav2.spec.structural.Augmentable;
import org.opendaylight.mdsal.binding.javav2.spec.structural.Augmentation;
import org.opendaylight.mdsal.binding.javav2.spec.base.IdentifiableItem;
import org.opendaylight.mdsal.binding.javav2.spec.base.InstanceIdentifier;
import org.opendaylight.mdsal.binding.javav2.spec.base.Notification;
import org.opendaylight.mdsal.binding.javav2.spec.structural.TreeChildNode;
import org.opendaylight.mdsal.binding.javav2.spec.base.TreeNode;
import org.opendaylight.mdsal.binding.javav2.spec.base.TreeRoot;
import org.opendaylight.yangtools.concepts.Identifier;

public final class BindingTypes {

    public static final ConcreteType AUGMENTABLE = Types.typeForClass(Augmentable.class);
    public static final ConcreteType AUGMENTATION = Types.typeForClass(Augmentation.class);
    public static final ConcreteType TREE_NODE = Types.typeForClass(TreeNode.class);
    public static final ConcreteType TREE_ROOT = Types.typeForClass(TreeRoot.class);
    public static final ConcreteType IDENTIFIABLE_ITEM = Types.typeForClass(IdentifiableItem.class);
    public static final ConcreteType IDENTIFIER = Types.typeForClass(Identifier.class);
    public static final ConcreteType INSTANCE_IDENTIFIER = Types.typeForClass(InstanceIdentifier.class);
    public static final ConcreteType NOTIFICATION = Types.typeForClass(Notification.class);
    public static final ConcreteType NOTIFICATION_LISTENER = Types.typeForClass(NotificationListener.class);

    private static final ConcreteType TREE_CHILD_NODE = Types.typeForClass(TreeChildNode.class);

    private BindingTypes() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static ParameterizedType augmentable(Type t) {
        return Types.parameterizedTypeFor(AUGMENTABLE, t);
    }

    public static ParameterizedType treeChildNode(Type t) {
        return Types.parameterizedTypeFor(TREE_CHILD_NODE, t);
    }

}
