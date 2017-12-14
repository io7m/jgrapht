/*
 * (C) Copyright 2017-2017, by Dimitrios Michail and Contributors.
 *
 * JGraphT : a free Java graph-theory library
 *
 * This program and the accompanying materials are dual-licensed under
 * either
 *
 * (a) the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation, or (at your option) any
 * later version.
 *
 * or (per the licensee's choosing)
 *
 * (b) the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation.
 */

package org.jgrapht.graph;

/**
 * Exception thrown in the event that the path is invalid.
 */
class InvalidGraphWalkException
    extends RuntimeException
{
    private static final long serialVersionUID = 3811666107707436479L;

    public InvalidGraphWalkException(String message)
    {
        super(message);
    }

}
