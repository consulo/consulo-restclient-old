/**
 * @author VISTALL
 * @since 13/01/2023
 */
module consulo.restclient
{
	requires consulo.application.api;
	requires consulo.base.icon.library;
	requires consulo.code.editor.api;
	requires consulo.component.api;
	requires consulo.datacontext.api;
	requires consulo.disposer.api;
	requires consulo.document.api;
	requires consulo.language.api;
	requires consulo.language.editor.api;
	requires consulo.language.editor.ui.api;
	requires consulo.localize.api;
	requires consulo.logging.api;
	requires consulo.project.api;
	requires consulo.project.ui.api;
	requires consulo.ui.api;
	requires consulo.ui.ex.api;
	requires consulo.ui.ex.awt.api;
	requires consulo.util.collection;
	requires consulo.util.jdom;
	requires consulo.util.lang;
	requires consulo.virtual.file.system.api;

	requires org.apache.httpcomponents.core5.httpcore5;
	requires org.apache.httpcomponents.core5.httpcore5.h2;
	requires org.apache.httpcomponents.client5.httpclient5;

	// TODO remove in future
	requires java.desktop;
	requires forms.rt;
}
