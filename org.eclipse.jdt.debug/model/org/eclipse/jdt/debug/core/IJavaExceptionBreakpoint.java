package org.eclipse.jdt.debug.core;

/*
 * (c) Copyright IBM Corp. 2000, 2001.
 * All Rights Reserved.
 */
 
import org.eclipse.core.runtime.CoreException;

/**
 * Java exception breakpoints are java breakpoints that suspend
 * execution when an exception is thrown. If the breakpoint is
 * a caught exception breakpoint, it will suspend execution when
 * the associated exception is thrown and caught.If the breakpoint
 * is an uncaught exception breakpoint, it will suspend execution
 * when the associated exception is thrown and not caught.
 * 
 * Clients are not intended to implement this interface.
 */
public interface IJavaExceptionBreakpoint extends IJavaBreakpoint {
	/**
	 * Returns whether this breakpoint suspends execution when the
	 * associated exception is thrown and caught.
	 * 
	 * @return <code>true</code> if this is a caught exception
	 *  breakpoint
	 * @exception CoreException if a <code>CoreException</code> is
	 * 	thrown accessing this breakpoint's underlying marker
	 */
	public boolean isCaught() throws CoreException;
	/**
	 * Returns whether this breakpoint suspends execution when the
	 * associated exception is thrown and not caught.
	 * 
	 * @return <code>true</code> if this is an uncaught exception
	 *  breakpoint.
	 * @exception CoreException if a <code>CoreException</code> is
	 * 	thrown accessing this breakpoint's underlying marker
	 */
	public boolean isUncaught() throws CoreException;		
	/**
	 * Sets whether this breakpoint suspends execution when the associated
	 * exception is thrown and caught.
	 *
	 * @param caught whether or not this breakpoint suspends execution when the
	 *  associated exception is thrown and caught
	 * @exception CoreException if a <code>CoreException</code> is
	 * 	thrown accessing this breakpoint's underlying marker
	 */
	public void setCaught(boolean caught) throws CoreException;
	/**
	 * Sets whether this breakpoint suspends execution when the associated
	 * exception is thrown and not caught.
	 * 
	 * @param uncaught whether or not this breakpoint suspends execution when the
	 *  associated exception is thrown and not caught
	 * @exception CoreException if a <code>CoreException</code> is
	 * 	thrown accessing this breakpoint's underlying marker
	 */	
	public void setUncaught(boolean uncaught) throws CoreException;
	/**
	 * Returns whether the exception associated with this breakpoint is a
	 * checked exception (i.e. compiler detected, not a runtime exception)
	 * 
	 * @return <code>true</code> if the exception associated with this breakpoint
	 *  is a checked exception
	 * @exception CoreException if a <code>CoreException</code> is
	 * 	thrown accessing this breakpoint's underlying marker
	 */
	public boolean isChecked() throws CoreException;
}

