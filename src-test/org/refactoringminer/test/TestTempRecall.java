package org.refactoringminer.test;

import static org.junit.Assert.*;

import org.refactoringminer.rm1.GitHistoryRefactoringMinerImpl;
import org.refactoringminer.rm2.analysis.GitHistoryRefactoringMiner2;

import org.junit.Test;

public class TestTempRecall {

	@Test
	public void testPushDown() throws Exception {

		TestBuilder test = new TestBuilder(new GitHistoryRefactoringMinerImpl(), "tmp");

		test.project("https://github.com/danilofes/atunes-refactorings.git", "master")

				.atCommit("8ecd468c8cb6ff85be55249a82497f7c3dcc46e1")
				.containsOnly(
						"Push Down Method protected before() : void from class net.sourceforge.atunes.kernel.BackgroundWorkerWithIndeterminateProgress to protected before() : void from class net.sourceforge.atunes.kernel.modules.playlist.UpdateDynamicPlayListBackgroundWorker",
						"Push Down Method protected before() : void from class net.sourceforge.atunes.kernel.BackgroundWorkerWithIndeterminateProgress to protected before() : void from class net.sourceforge.atunes.kernel.modules.radio.RetrieveRadioBrowserDataBackgroundWorker",
						"Push Down Method protected before() : void from class net.sourceforge.atunes.kernel.BackgroundWorkerWithIndeterminateProgress to protected before() : void from class net.sourceforge.atunes.kernel.modules.repository.CalculateSynchronizationBetweenDeviceAndPlayListBackgroundWorker",
						"Push Down Method protected before() : void from class net.sourceforge.atunes.kernel.BackgroundWorkerWithIndeterminateProgress to protected before() : void from class net.sourceforge.atunes.kernel.modules.repository.DeleteFilesTask",
						"Push Down Method protected before() : void from class net.sourceforge.atunes.kernel.BackgroundWorkerWithIndeterminateProgress to protected before() : void from class net.sourceforge.atunes.kernel.modules.repository.RemoveFoldersFromDiskBackgroundWorker",
						"Push Down Method protected before() : void from class net.sourceforge.atunes.kernel.BackgroundWorkerWithIndeterminateProgress to protected before() : void from class net.sourceforge.atunes.kernel.modules.state.ValidateAndProcessPreferencesBackgroundWorker",
						"Push Down Method protected encodeString(str String) : String from class net.sourceforge.atunes.kernel.modules.webservices.lyrics.AbstractLyricsEngine to protected encodeString(str String) : String from class net.sourceforge.atunes.kernel.modules.webservices.lyrics.LyrcEngine",
						"Push Down Method protected encodeString(str String) : String from class net.sourceforge.atunes.kernel.modules.webservices.lyrics.AbstractLyricsEngine to protected encodeString(str String) : String from class net.sourceforge.atunes.kernel.modules.webservices.lyrics.LyrDBEngine",
						"Push Down Method protected encodeString(str String) : String from class net.sourceforge.atunes.kernel.modules.webservices.lyrics.AbstractLyricsEngine to protected encodeString(str String) : String from class net.sourceforge.atunes.kernel.modules.webservices.lyrics.LyricsDirectoryEngine",
						"Push Down Method protected encodeString(str String) : String from class net.sourceforge.atunes.kernel.modules.webservices.lyrics.AbstractLyricsEngine to protected encodeString(str String) : String from class net.sourceforge.atunes.kernel.modules.webservices.lyrics.LyricWikiEngine",
						"Push Down Method protected encodeString(str String) : String from class net.sourceforge.atunes.kernel.modules.webservices.lyrics.AbstractLyricsEngine to protected encodeString(str String) : String from class net.sourceforge.atunes.kernel.modules.webservices.lyrics.WinampcnEngine",
						"Push Down Method public initialize() : void from class net.sourceforge.atunes.gui.views.dialogs.ProgressDialog to public initialize() : void from class net.sourceforge.atunes.gui.views.dialogs.TransferProgressDialog",
						"Push Down Method public setLookAndFeelManager(lookAndFeelManager ILookAndFeelManager) : void from class net.sourceforge.atunes.gui.AbstractTreeCellDecorator to public setLookAndFeelManager(lookAndFeelManager ILookAndFeelManager) : void from class net.sourceforge.atunes.gui.views.decorators.AlbumTreeCellDecorator",
						"Push Down Method public setLookAndFeelManager(lookAndFeelManager ILookAndFeelManager) : void from class net.sourceforge.atunes.gui.AbstractTreeCellDecorator to public setLookAndFeelManager(lookAndFeelManager ILookAndFeelManager) : void from class net.sourceforge.atunes.gui.views.decorators.ArtistTreeCellDecorator",
						"Push Down Method public setLookAndFeelManager(lookAndFeelManager ILookAndFeelManager) : void from class net.sourceforge.atunes.gui.AbstractTreeCellDecorator to public setLookAndFeelManager(lookAndFeelManager ILookAndFeelManager) : void from class net.sourceforge.atunes.gui.views.decorators.FolderTreeCellDecorator",
						"Push Down Method public setLookAndFeelManager(lookAndFeelManager ILookAndFeelManager) : void from class net.sourceforge.atunes.gui.AbstractTreeCellDecorator to public setLookAndFeelManager(lookAndFeelManager ILookAndFeelManager) : void from class net.sourceforge.atunes.gui.views.decorators.GenreTreeCellDecorator",
						"Push Down Method public setLookAndFeelManager(lookAndFeelManager ILookAndFeelManager) : void from class net.sourceforge.atunes.gui.AbstractTreeCellDecorator to public setLookAndFeelManager(lookAndFeelManager ILookAndFeelManager) : void from class net.sourceforge.atunes.gui.views.decorators.IncompleteTagsTreeCellDecorator",
						"Push Down Method public setLookAndFeelManager(lookAndFeelManager ILookAndFeelManager) : void from class net.sourceforge.atunes.gui.AbstractTreeCellDecorator to public setLookAndFeelManager(lookAndFeelManager ILookAndFeelManager) : void from class net.sourceforge.atunes.gui.views.decorators.NavigationTreeRootTreeCellDecorator",
						"Push Down Method public setLookAndFeelManager(lookAndFeelManager ILookAndFeelManager) : void from class net.sourceforge.atunes.gui.AbstractTreeCellDecorator to public setLookAndFeelManager(lookAndFeelManager ILookAndFeelManager) : void from class net.sourceforge.atunes.gui.views.decorators.PodcastFeedTreeCellDecorator",
						"Push Down Method public setLookAndFeelManager(lookAndFeelManager ILookAndFeelManager) : void from class net.sourceforge.atunes.gui.AbstractTreeCellDecorator to public setLookAndFeelManager(lookAndFeelManager ILookAndFeelManager) : void from class net.sourceforge.atunes.gui.views.decorators.RadioTreeCellDecorator",
						"Push Down Method public setLookAndFeelManager(lookAndFeelManager ILookAndFeelManager) : void from class net.sourceforge.atunes.gui.AbstractTreeCellDecorator to public setLookAndFeelManager(lookAndFeelManager ILookAndFeelManager) : void from class net.sourceforge.atunes.gui.views.decorators.StringTreeCellDecorator",
						"Push Down Method public setLookAndFeelManager(lookAndFeelManager ILookAndFeelManager) : void from class net.sourceforge.atunes.gui.AbstractTreeCellDecorator to public setLookAndFeelManager(lookAndFeelManager ILookAndFeelManager) : void from class net.sourceforge.atunes.gui.views.decorators.UnknownElementTreeCellDecorator",
						"Push Down Method public setLookAndFeelManager(lookAndFeelManager ILookAndFeelManager) : void from class net.sourceforge.atunes.gui.AbstractTreeCellDecorator to public setLookAndFeelManager(lookAndFeelManager ILookAndFeelManager) : void from class net.sourceforge.atunes.gui.views.decorators.YearTreeCellDecorator",
						"Push Down Method public setLookAndFeelManager(lookAndFeelManager ILookAndFeelManager) : void from class net.sourceforge.atunes.gui.AbstractTreeCellDecorator to public setLookAndFeelManager(lookAndFeelManager ILookAndFeelManager) : void from class net.sourceforge.atunes.kernel.modules.navigator.TooltipTreeCellDecorator",
						"Push Down Method public sort(column IColumn) : void from class net.sourceforge.atunes.gui.AbstractColumnSetTableModel to public sort(column IColumn) : void from class net.sourceforge.atunes.gui.AlbumTableModel",
						"Push Down Method public sort(column IColumn) : void from class net.sourceforge.atunes.gui.AbstractColumnSetTableModel to public sort(column IColumn) : void from class net.sourceforge.atunes.gui.NavigationTableModel",
						"Push Down Method public sort(column IColumn) : void from class net.sourceforge.atunes.gui.AbstractColumnSetTableModel to public sort(column IColumn) : void from class net.sourceforge.atunes.kernel.modules.playlist.PlayListTableModel",
						"Push Down Method public sort(column IColumn) : void from class net.sourceforge.atunes.gui.AbstractColumnSetTableModel to public sort(column IColumn) : void from class net.sourceforge.atunes.kernel.modules.search.SearchResultTableModel")

				.atCommit("ca59aa0f0ad21a3b4a31b8f172dc941c59207c63").containsOnly(

						"Push Down Attribute private columnSet : IColumnSet from class net.sourceforge.atunes.gui.AbstractColumnSetTableModel to class net.sourceforge.atunes.gui.AlbumTableModel",
						"Push Down Attribute private columnSet : IColumnSet from class net.sourceforge.atunes.gui.AbstractColumnSetTableModel to class net.sourceforge.atunes.gui.NavigationTableModel",
						"Push Down Attribute private columnSet : IColumnSet from class net.sourceforge.atunes.gui.AbstractColumnSetTableModel to class net.sourceforge.atunes.kernel.modules.search.SearchResultTableModel",
						"Push Down Attribute private columnSet : IColumnSet from class net.sourceforge.atunes.gui.AbstractColumnSetTableModel to class net.sourceforge.atunes.kernel.modules.playlist.PlayListTableModel",
						"Push Down Attribute private dialogFactory : IDialogFactory from class net.sourceforge.atunes.kernel.BackgroundWorkerWithIndeterminateProgress to class net.sourceforge.atunes.kernel.modules.playlist.UpdateDynamicPlayListBackgroundWorker",
						"Push Down Attribute private dialogFactory : IDialogFactory from class net.sourceforge.atunes.kernel.BackgroundWorkerWithIndeterminateProgress to class net.sourceforge.atunes.kernel.modules.radio.RetrieveRadioBrowserDataBackgroundWorker",
						"Push Down Attribute private dialogFactory : IDialogFactory from class net.sourceforge.atunes.kernel.BackgroundWorkerWithIndeterminateProgress to class net.sourceforge.atunes.kernel.modules.repository.CalculateSynchronizationBetweenDeviceAndPlayListBackgroundWorker",
						"Push Down Attribute private dialogFactory : IDialogFactory from class net.sourceforge.atunes.kernel.BackgroundWorkerWithIndeterminateProgress to class net.sourceforge.atunes.kernel.modules.repository.DeleteFilesTask",
						"Push Down Attribute private dialogFactory : IDialogFactory from class net.sourceforge.atunes.kernel.BackgroundWorkerWithIndeterminateProgress to class net.sourceforge.atunes.kernel.modules.state.ValidateAndProcessPreferencesBackgroundWorker",
						"Push Down Attribute private dialogFactory : IDialogFactory from class net.sourceforge.atunes.kernel.BackgroundWorkerWithIndeterminateProgress to class net.sourceforge.atunes.kernel.modules.repository.RemoveFoldersFromDiskBackgroundWorker",
						"Push Down Attribute private frame : IFrame from class net.sourceforge.atunes.kernel.AbstractHandler to class net.sourceforge.atunes.kernel.modules.command.CommandHandler",
						"Push Down Attribute private frame : IFrame from class net.sourceforge.atunes.kernel.AbstractHandler to class net.sourceforge.atunes.kernel.modules.context.ContextHandler",
						"Push Down Attribute private frame : IFrame from class net.sourceforge.atunes.kernel.AbstractHandler to class net.sourceforge.atunes.kernel.modules.favorites.FavoritesHandler",
						"Push Down Attribute private frame : IFrame from class net.sourceforge.atunes.kernel.AbstractHandler to class net.sourceforge.atunes.kernel.modules.filter.FilterHandler",
						"Push Down Attribute private frame : IFrame from class net.sourceforge.atunes.kernel.AbstractHandler to class net.sourceforge.atunes.kernel.modules.fullscreen.FullScreenHandler",
						"Push Down Attribute private frame : IFrame from class net.sourceforge.atunes.kernel.AbstractHandler to class net.sourceforge.atunes.kernel.modules.hotkeys.HotkeyHandler",
						"Push Down Attribute private frame : IFrame from class net.sourceforge.atunes.kernel.AbstractHandler to class net.sourceforge.atunes.kernel.modules.instances.MultipleInstancesHandler",
						"Push Down Attribute private frame : IFrame from class net.sourceforge.atunes.kernel.AbstractHandler to class net.sourceforge.atunes.kernel.modules.navigator.NavigationHandler",
						"Push Down Attribute private frame : IFrame from class net.sourceforge.atunes.kernel.AbstractHandler to class net.sourceforge.atunes.kernel.modules.network.NetworkHandler",
						"Push Down Attribute private frame : IFrame from class net.sourceforge.atunes.kernel.AbstractHandler to class net.sourceforge.atunes.kernel.modules.notify.NotificationsHandler",
						"Push Down Attribute private frame : IFrame from class net.sourceforge.atunes.kernel.AbstractHandler to class net.sourceforge.atunes.kernel.modules.player.AdvancedPlayingModeHandler",
						"Push Down Attribute private frame : IFrame from class net.sourceforge.atunes.kernel.AbstractHandler to class net.sourceforge.atunes.kernel.modules.player.PlayerHandler",
						"Push Down Attribute private frame : IFrame from class net.sourceforge.atunes.kernel.AbstractHandler to class net.sourceforge.atunes.kernel.modules.playlist.PlayListHandler",
						"Push Down Attribute private frame : IFrame from class net.sourceforge.atunes.kernel.AbstractHandler to class net.sourceforge.atunes.kernel.modules.playlist.SmartPlayListHandler",
						"Push Down Attribute private frame : IFrame from class net.sourceforge.atunes.kernel.AbstractHandler to class net.sourceforge.atunes.kernel.modules.podcast.PodcastFeedHandler",
						"Push Down Attribute private frame : IFrame from class net.sourceforge.atunes.kernel.AbstractHandler to class net.sourceforge.atunes.kernel.modules.radio.RadioHandler",
						"Push Down Attribute private frame : IFrame from class net.sourceforge.atunes.kernel.AbstractHandler to class net.sourceforge.atunes.kernel.modules.repository.DeviceHandler",
						"Push Down Attribute private frame : IFrame from class net.sourceforge.atunes.kernel.AbstractHandler to class net.sourceforge.atunes.kernel.modules.repository.RepositoryHandler",
						"Push Down Attribute private frame : IFrame from class net.sourceforge.atunes.kernel.AbstractHandler to class net.sourceforge.atunes.kernel.modules.search.SearchHandler",
						"Push Down Attribute private frame : IFrame from class net.sourceforge.atunes.kernel.AbstractHandler to class net.sourceforge.atunes.kernel.modules.statistics.StatisticsHandler",
						"Push Down Attribute private frame : IFrame from class net.sourceforge.atunes.kernel.AbstractHandler to class net.sourceforge.atunes.kernel.modules.tags.TagHandler",
						"Push Down Attribute private frame : IFrame from class net.sourceforge.atunes.kernel.AbstractHandler to class net.sourceforge.atunes.kernel.modules.tray.SystemTrayHandler",
						"Push Down Attribute private frame : IFrame from class net.sourceforge.atunes.kernel.AbstractHandler to class net.sourceforge.atunes.kernel.modules.ui.UIHandler",
						"Push Down Attribute private frame : IFrame from class net.sourceforge.atunes.kernel.AbstractHandler to class net.sourceforge.atunes.kernel.modules.updates.UpdateHandler",
						"Push Down Attribute private frame : IFrame from class net.sourceforge.atunes.kernel.AbstractHandler to class net.sourceforge.atunes.kernel.modules.webservices.WebServicesHandler",
						"Push Down Attribute private frame : IFrame from class net.sourceforge.atunes.kernel.AbstractHandler to class net.sourceforge.atunes.kernel.modules.cdripper.RipperHandler",
						"Push Down Attribute private networkHandler : INetworkHandler from class net.sourceforge.atunes.kernel.modules.webservices.lyrics.AbstractLyricsEngine to class net.sourceforge.atunes.kernel.modules.webservices.lyrics.LyrcEngine",
						"Push Down Attribute private networkHandler : INetworkHandler from class net.sourceforge.atunes.kernel.modules.webservices.lyrics.AbstractLyricsEngine to class net.sourceforge.atunes.kernel.modules.webservices.lyrics.LyrDBEngine",
						"Push Down Attribute private networkHandler : INetworkHandler from class net.sourceforge.atunes.kernel.modules.webservices.lyrics.AbstractLyricsEngine to class net.sourceforge.atunes.kernel.modules.webservices.lyrics.LyricWikiEngine",
						"Push Down Attribute private networkHandler : INetworkHandler from class net.sourceforge.atunes.kernel.modules.webservices.lyrics.AbstractLyricsEngine to class net.sourceforge.atunes.kernel.modules.webservices.lyrics.WinampcnEngine",
						"Push Down Attribute private networkHandler : INetworkHandler from class net.sourceforge.atunes.kernel.modules.webservices.lyrics.AbstractLyricsEngine to class net.sourceforge.atunes.kernel.modules.webservices.lyrics.LyricsDirectoryEngine",
						"Push Down Attribute private cancelButton : JButton from class net.sourceforge.atunes.gui.views.dialogs.ProgressDialog to class net.sourceforge.atunes.gui.views.dialogs.TransferProgressDialog",
						"Push Down Method public setColumnSet(columnSet IColumnSet) : void from class net.sourceforge.atunes.gui.AbstractColumnSetTableModel to public setColumnSet(columnSet IColumnSet) : void from class net.sourceforge.atunes.gui.AlbumTableModel"

				).atCommit("ca59aa0f0ad21a3b4a31b8f172dc941c59207c63").notContains("Push Down Method protected getDialogFactory() : IDialogFactory from class net.sourceforge.atunes.kernel.BackgroundWorkerWithIndeterminateProgress to public getDialogFactory() : IDialogFactory from class net.sourceforge.atunes.kernel.modules.playlist.UpdateDynamicPlayListBackgroundWorker", 
						"Push Down Method protected getDialogFactory() : IDialogFactory from class net.sourceforge.atunes.kernel.BackgroundWorkerWithIndeterminateProgress to public getDialogFactory() : IDialogFactory from class net.sourceforge.atunes.kernel.modules.radio.RetrieveRadioBrowserDataBackgroundWorker", "Push Down Method protected getDialogFactory() : IDialogFactory from class net.sourceforge.atunes.kernel.BackgroundWorkerWithIndeterminateProgress to public getDialogFactory() : IDialogFactory from class net.sourceforge.atunes.kernel.modules.repository.CalculateSynchronizationBetweenDeviceAndPlayListBackgroundWorker", "Push Down Method protected getDialogFactory() : IDialogFactory from class net.sourceforge.atunes.kernel.BackgroundWorkerWithIndeterminateProgress to public getDialogFactory() : IDialogFactory from class net.sourceforge.atunes.kernel.modules.repository.DeleteFilesTask", "Push Down Method protected getDialogFactory() : IDialogFactory from class net.sourceforge.atunes.kernel.BackgroundWorkerWithIndeterminateProgress to public getDialogFactory() : IDialogFactory from class net.sourceforge.atunes.kernel.modules.repository.RemoveFoldersFromDiskBackgroundWorker", "Push Down Method protected getDialogFactory() : IDialogFactory from class net.sourceforge.atunes.kernel.BackgroundWorkerWithIndeterminateProgress to public getDialogFactory() : IDialogFactory from class net.sourceforge.atunes.kernel.modules.state.ValidateAndProcessPreferencesBackgroundWorker", "Push Down Method public setDialogFactory(dialogFactory IDialogFactory) : void from class net.sourceforge.atunes.kernel.BackgroundWorkerWithIndeterminateProgress to public setDialogFactory(dialogFactory IDialogFactory) : void from class net.sourceforge.atunes.kernel.modules.radio.RetrieveRadioBrowserDataBackgroundWorker", "Push Down Method public setDialogFactory(dialogFactory IDialogFactory) : void from class net.sourceforge.atunes.kernel.BackgroundWorkerWithIndeterminateProgress to public setDialogFactory(dialogFactory IDialogFactory) : void from class net.sourceforge.atunes.kernel.modules.repository.CalculateSynchronizationBetweenDeviceAndPlayListBackgroundWorker", "Push Down Method public setDialogFactory(dialogFactory IDialogFactory) : void from class net.sourceforge.atunes.kernel.BackgroundWorkerWithIndeterminateProgress to public setDialogFactory(dialogFactory IDialogFactory) : void from class net.sourceforge.atunes.kernel.modules.repository.DeleteFilesTask", "Push Down Method public setDialogFactory(dialogFactory IDialogFactory) : void from class net.sourceforge.atunes.kernel.BackgroundWorkerWithIndeterminateProgress to public setDialogFactory(dialogFactory IDialogFactory) : void from class net.sourceforge.atunes.kernel.modules.repository.RemoveFoldersFromDiskBackgroundWorker", "Push Down Method public setDialogFactory(dialogFactory IDialogFactory) : void from class net.sourceforge.atunes.kernel.BackgroundWorkerWithIndeterminateProgress to public setDialogFactory(dialogFactory IDialogFactory) : void from class net.sourceforge.atunes.kernel.modules.state.ValidateAndProcessPreferencesBackgroundWorker", "Push Down Method public setFrame(frame IFrame) : void from class net.sourceforge.atunes.kernel.AbstractHandler to public setFrame(frame IFrame) : void from class net.sourceforge.atunes.kernel.modules.favorites.FavoritesHandler", "Push Down Method public setNetworkHandler(networkHandler INetworkHandler) : void from class net.sourceforge.atunes.kernel.modules.webservices.lyrics.AbstractLyricsEngine to public setNetworkHandler(networkHandler INetworkHandler) : void from class net.sourceforge.atunes.kernel.modules.webservices.lyrics.LyrcEngine", "Push Down Method public setNetworkHandler(networkHandler INetworkHandler) : void from class net.sourceforge.atunes.kernel.modules.webservices.lyrics.AbstractLyricsEngine to public setNetworkHandler(networkHandler INetworkHandler) : void from class net.sourceforge.atunes.kernel.modules.webservices.lyrics.LyrDBEngine", "Push Down Method public setNetworkHandler(networkHandler INetworkHandler) : void from class net.sourceforge.atunes.kernel.modules.webservices.lyrics.AbstractLyricsEngine to public setNetworkHandler(networkHandler INetworkHandler) : void from class net.sourceforge.atunes.kernel.modules.webservices.lyrics.LyricsDirectoryEngine", "Push Down Method public setNetworkHandler(networkHandler INetworkHandler) : void from class net.sourceforge.atunes.kernel.modules.webservices.lyrics.AbstractLyricsEngine to public setNetworkHandler(networkHandler INetworkHandler) : void from class net.sourceforge.atunes.kernel.modules.webservices.lyrics.LyricWikiEngine", "Push Down Method public setNetworkHandler(networkHandler INetworkHandler) : void from class net.sourceforge.atunes.kernel.modules.webservices.lyrics.AbstractLyricsEngine to public setNetworkHandler(networkHandler INetworkHandler) : void from class net.sourceforge.atunes.kernel.modules.webservices.lyrics.WinampcnEngine", "Push Down Method public setColumnSet(columnSet IColumnSet) : void from class net.sourceforge.atunes.gui.AbstractColumnSetTableModel to public setColumnSet(columnSet IColumnSet) : void from class net.sourceforge.atunes.gui.NavigationTableModel", "Push Down Method public setColumnSet(columnSet IColumnSet) : void from class net.sourceforge.atunes.gui.AbstractColumnSetTableModel to public setColumnSet(columnSet IColumnSet) : void from class net.sourceforge.atunes.kernel.modules.playlist.PlayListTableModel", "Push Down Method public setColumnSet(columnSet IColumnSet) : void from class net.sourceforge.atunes.gui.AbstractColumnSetTableModel to public setColumnSet(columnSet IColumnSet) : void from class net.sourceforge.atunes.kernel.modules.search.SearchResultTableModel", "Push Down Method protected getFrame() : IFrame from class net.sourceforge.atunes.kernel.AbstractHandler to protected getFrame() : IFrame from class net.sourceforge.atunes.kernel.modules.favorites.FavoritesHandler", "Push Down Method public setDialogFactory(dialogFactory IDialogFactory) : void from class net.sourceforge.atunes.kernel.BackgroundWorkerWithIndeterminateProgress to public setDialogFactory(dialogFactory IDialogFactory) : void from class net.sourceforge.atunes.kernel.modules.playlist.UpdateDynamicPlayListBackgroundWorker")

		;

		test.project("https://github.com/danilofes/argouml-refactorings.git", "master")
				.atCommit("26b089d0c3f74abadcf8645f4f7618bdc0c3738f").containsOnly(
						"Push Down Method private onButtonClicked(metaType Object) : void from class org.argouml.uml.diagram.ui.SelectionClassifierBox to protected onButtonClicked(metaType Object) : void from class org.argouml.uml.diagram.static_structure.ui.SelectionGeneralizableElement",
						"Push Down Method private onButtonClicked(metaType Object) : void from class org.argouml.uml.diagram.ui.SelectionClassifierBox to protected onButtonClicked(metaType Object) : void from class org.argouml.uml.diagram.static_structure.ui.SelectionInterface",
						"Push Down Method private onButtonClicked(metaType Object) : void from class org.argouml.uml.diagram.ui.SelectionClassifierBox to protected onButtonClicked(metaType Object) : void from class org.argouml.uml.diagram.static_structure.ui.SelectionClass",
						"Push Down Method protected getBBoxLabel() : JLabel from class org.argouml.ui.StylePanelFig to protected getBBoxLabel() : JLabel from class org.argouml.ui.StylePanelFigRRect",
						"Push Down Method protected getBBoxLabel() : JLabel from class org.argouml.ui.StylePanelFig to protected getBBoxLabel() : JLabel from class org.argouml.ui.StylePanelFigText",
						"Push Down Method protected getBBoxLabel() : JLabel from class org.argouml.ui.StylePanelFig to protected getBBoxLabel() : JLabel from class org.argouml.uml.diagram.ui.SPFigEdgeModelElement",
						"Push Down Method protected getInstructions(i int) : String from class org.argouml.uml.diagram.static_structure.ui.SelectionGeneralizableElement to protected getInstructions(i int) : String from class org.argouml.uml.diagram.static_structure.ui.SelectionException",
						"Push Down Method protected getInstructions(i int) : String from class org.argouml.uml.diagram.static_structure.ui.SelectionGeneralizableElement to protected getInstructions(i int) : String from class org.argouml.uml.diagram.static_structure.ui.SelectionSignal",
						"Push Down Method public layout() : void from class org.argouml.uml.diagram.static_structure.layout.ClassdiagramInheritanceEdge to public layout() : void from class org.argouml.uml.diagram.static_structure.layout.ClassdiagramRealizationEdge",
						"Push Down Method public mouseReleased(me MouseEvent) : void from class org.argouml.uml.diagram.ui.SelectionClassifierBox to public mouseReleased(me MouseEvent) : void from class org.argouml.uml.diagram.static_structure.ui.SelectionClass",
						"Push Down Method public mouseReleased(me MouseEvent) : void from class org.argouml.uml.diagram.ui.SelectionClassifierBox to public mouseReleased(me MouseEvent) : void from class org.argouml.uml.diagram.static_structure.ui.SelectionInterface",
						"Push Down Method public offerSuggestion() : String from class org.argouml.uml.cognitive.critics.UMLWizard to public offerSuggestion() : String from class org.argouml.uml.cognitive.critics.WizAddConstructor",
						"Push Down Method public offerSuggestion() : String from class org.argouml.uml.cognitive.critics.UMLWizard to public offerSuggestion() : String from class org.argouml.uml.cognitive.critics.WizAddInstanceVariable",
						"Push Down Method public offerSuggestion() : String from class org.argouml.uml.cognitive.critics.UMLWizard to public offerSuggestion() : String from class org.argouml.uml.cognitive.critics.WizAddOperation",
						"Push Down Method public offerSuggestion() : String from class org.argouml.uml.cognitive.critics.UMLWizard to public offerSuggestion() : String from class org.argouml.uml.cognitive.critics.WizAssocComposite",
						"Push Down Method public offerSuggestion() : String from class org.argouml.uml.cognitive.critics.UMLWizard to public offerSuggestion() : String from class org.argouml.uml.cognitive.critics.WizCueCards",
						"Push Down Method public offerSuggestion() : String from class org.argouml.uml.cognitive.critics.UMLWizard to public offerSuggestion() : String from class org.argouml.uml.cognitive.critics.WizManyNames",
						"Push Down Method public offerSuggestion() : String from class org.argouml.uml.cognitive.critics.UMLWizard to public offerSuggestion() : String from class org.argouml.uml.cognitive.critics.WizMEName",
						"Push Down Method public offerSuggestion() : String from class org.argouml.uml.cognitive.critics.UMLWizard to public offerSuggestion() : String from class org.argouml.uml.cognitive.critics.WizNavigable",
						"Push Down Method public offerSuggestion() : String from class org.argouml.uml.cognitive.critics.UMLWizard to public offerSuggestion() : String from class org.argouml.uml.cognitive.critics.WizTooMany",
						"Push Down Method public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.NotationProvider to public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.providers.AssociationEndNameNotation",
						"Push Down Method public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.NotationProvider to public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.providers.AssociationNameNotation",
						"Push Down Method public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.NotationProvider to public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.providers.AssociationRoleNotation",
						"Push Down Method public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.NotationProvider to public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.providers.AttributeNotation",
						"Push Down Method public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.NotationProvider to public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.providers.CallStateNotation",
						"Push Down Method public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.NotationProvider to public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.providers.ClassifierRoleNotation",
						"Push Down Method public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.NotationProvider to public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.providers.ComponentInstanceNotation",
						"Push Down Method public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.NotationProvider to public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.providers.EnumerationLiteralNotation",
						"Push Down Method public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.NotationProvider to public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.providers.ExtensionPointNotation",
						"Push Down Method public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.NotationProvider to public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.providers.MessageNotation",
						"Push Down Method public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.NotationProvider to public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.providers.ModelElementNameNotation",
						"Push Down Method public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.NotationProvider to public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.providers.MultiplicityNotation",
						"Push Down Method public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.NotationProvider to public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.providers.NodeInstanceNotation",
						"Push Down Method public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.NotationProvider to public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.providers.ObjectFlowStateStateNotation",
						"Push Down Method public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.NotationProvider to public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.providers.ObjectFlowStateTypeNotation",
						"Push Down Method public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.NotationProvider to public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.providers.ObjectNotation",
						"Push Down Method public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.NotationProvider to public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.providers.OperationNotation",
						"Push Down Method public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.NotationProvider to public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.providers.StateBodyNotation",
						"Push Down Method public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.NotationProvider to public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.providers.TestNotationProviderFactory2.MyNP",
						"Push Down Method public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.NotationProvider to public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.providers.TransitionNotation",
						"Push Down Method public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.NotationProvider to public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.TestNotationProvider.NPImpl",
						"Push Down Method public setFlat(b boolean) : void from class org.argouml.cognitive.ui.ToDoPerspective to public setFlat(b boolean) : void from class org.argouml.cognitive.ui.ToDoByGoal",
						"Push Down Method public setFlat(b boolean) : void from class org.argouml.cognitive.ui.ToDoPerspective to public setFlat(b boolean) : void from class org.argouml.cognitive.ui.ToDoByOffender",
						"Push Down Method public setFlat(b boolean) : void from class org.argouml.cognitive.ui.ToDoPerspective to public setFlat(b boolean) : void from class org.argouml.cognitive.ui.ToDoByPoster",
						"Push Down Method public setFlat(b boolean) : void from class org.argouml.cognitive.ui.ToDoPerspective to public setFlat(b boolean) : void from class org.argouml.cognitive.ui.ToDoByPriority",
						"Push Down Method public setFlat(b boolean) : void from class org.argouml.cognitive.ui.ToDoPerspective to public setFlat(b boolean) : void from class org.argouml.cognitive.ui.ToDoByType",
						"Push Down Method public setTarget(t Object) : void from class org.argouml.ui.StylePanelFigNodeModelElement to public setTarget(t Object) : void from class org.argouml.uml.diagram.static_structure.ui.StylePanelFigInterface",
						"Push Down Method public setTarget(t Object) : void from class org.argouml.ui.StylePanelFigNodeModelElement to public setTarget(t Object) : void from class org.argouml.uml.diagram.static_structure.ui.StylePanelFigPackage",
						"Push Down Method public setTarget(t Object) : void from class org.argouml.ui.StylePanelFigNodeModelElement to public setTarget(t Object) : void from class org.argouml.uml.diagram.ui.StylePanelFigAssociationClass",
						"Push Down Method public setTarget(t Object) : void from class org.argouml.ui.StylePanelFigNodeModelElement to public setTarget(t Object) : void from class org.argouml.uml.diagram.ui.StylePanelFigMessage",
						"Push Down Method public setTarget(t Object) : void from class org.argouml.ui.StylePanelFigNodeModelElement to public setTarget(t Object) : void from class org.argouml.uml.diagram.use_case.ui.StylePanelFigUseCase",
						"Push Down Method public mouseReleased(me MouseEvent) : void from class org.argouml.uml.diagram.ui.SelectionClassifierBox to public mouseReleased(me MouseEvent) : void from class org.argouml.uml.diagram.static_structure.ui.SelectionGeneralizableElement",
						"Push Down Method public setFlat(b boolean) : void from class org.argouml.cognitive.ui.ToDoPerspective to public setFlat(b boolean) : void from class org.argouml.cognitive.ui.ToDoByDecision",
						"Push Down Method public offerSuggestion() : String from class org.argouml.uml.cognitive.critics.UMLWizard to public offerSuggestion() : String from class org.argouml.uml.cognitive.critics.WizBreakCircularComp",
						"Push Down Method public setSuggestion(s String) : void from class org.argouml.uml.cognitive.critics.WizMEName to public setSuggestion(s String) : void from class org.argouml.uml.cognitive.critics.WizOperName",
						"Push Down Method protected getBBoxLabel() : JLabel from class org.argouml.ui.StylePanelFig to protected getBBoxLabel() : JLabel from class org.argouml.ui.StylePanelFigNodeModelElement",
						"Push Down Method public layout() : void from class org.argouml.uml.diagram.static_structure.layout.ClassdiagramInheritanceEdge to public layout() : void from class org.argouml.uml.diagram.static_structure.layout.ClassdiagramGeneralizationEdge",
						"Push Down Method public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.NotationProvider to public propertyChange(evt PropertyChangeEvent) : void from class org.argouml.notation.providers.ActionStateNotation",
						"Push Down Method public setTarget(t Object) : void from class org.argouml.ui.StylePanelFigNodeModelElement to public setTarget(t Object) : void from class org.argouml.uml.diagram.static_structure.ui.StylePanelFigClass",
						"Push Down Method protected getInstructions(i int) : String from class org.argouml.uml.diagram.static_structure.ui.SelectionGeneralizableElement to protected getInstructions(i int) : String from class org.argouml.uml.diagram.static_structure.ui.SelectionDataType"

		)

		;

		test.assertExpectations();

	}
	

	@Test
	public void testInlineMethod() throws Exception {

		TestBuilder test = new TestBuilder(new GitHistoryRefactoringMinerImpl(), "tmp1");

		test.project("https://github.com/danilofes/atunes-refactorings.git", "master")
				.atCommit("667a45ad8bcc94420d5c6d66b15b758c7eab1c1d").containsOnly(
						"Inline Method private finish(restart boolean) : void inlined to package finish() : void in class net.sourceforge.atunes.kernel.Finisher",
						"Inline Method private finish(restart boolean) : void inlined to package restart() : void in class net.sourceforge.atunes.kernel.Finisher",
						"Inline Method private formatTrackNumber(trackNumber int) : String inlined to public getAudioFileStringValue(audioFile ILocalAudioObject) : String in class net.sourceforge.atunes.kernel.modules.pattern.TrackPattern",
						"Inline Method private formatTrackNumber(trackNumber int) : String inlined to public getCDMetadataStringValue(metadata CDMetadata, trackNumber int) : String in class net.sourceforge.atunes.kernel.modules.pattern.TrackPattern",
						"Inline Method private getArtistSongs(listOfObjectsDragged List) : boolean inlined to public processInternalImport(support TransferSupport) : boolean in class net.sourceforge.atunes.kernel.modules.draganddrop.InternalImportProcessor",
						"Inline Method private persistRadios() : void inlined to public addRadio(radio IRadio) : void in class net.sourceforge.atunes.kernel.modules.radio.RadioHandler",
						"Inline Method private persistRadios() : void inlined to public removeRadios(radios List) : void in class net.sourceforge.atunes.kernel.modules.radio.RadioHandler",
						"Inline Method private persistRadios() : void inlined to public setLabel(radioList List, label String) : void in class net.sourceforge.atunes.kernel.modules.radio.RadioHandler",
						"Inline Method private addHeaderRenderers(jtable JTable, model AbstractCommonColumnModel, lookAndFeel ILookAndFeel) : void inlined to public decorate(decorateHeader boolean) : void in class net.sourceforge.atunes.gui.ColumnDecorator");

		test.project("https://github.com/danilofes/argouml-refactorings.git", "master")
				.atCommit("d8215ce80309b4bf8c92ac2e096cb8b06275aee6").containsOnly(
						"Inline Method private buildPanel() : void inlined to public getTabPanel() : JPanel in class org.argouml.notation.ui.SettingsTabNotation",
						"Inline Method private dealWithVisibility(attribute Object, visibility String) : void inlined to protected parseAttribute(text String, attribute Object) : void in class org.argouml.notation.providers.uml.AttributeNotationUml",
						"Inline Method private findTarget(t Object) : Object inlined to public setTarget(t Object) : void in class org.argouml.cognitive.checklist.ui.TabChecklist",
						"Inline Method private findTarget(t Object) : Object inlined to public shouldBeEnabled(t Object) : boolean in class org.argouml.cognitive.checklist.ui.TabChecklist",
						"Inline Method private getAssociationActions() : Object[] inlined to protected getUmlActions() : Object[] in class org.argouml.uml.diagram.deployment.ui.UMLDeploymentDiagram",
						"Inline Method private getPersistenceVersionFromFile(file File) : int inlined to protected doLoad(originalFile File, file File, progressMgr ProgressMgr) : Project in class org.argouml.persistence.UmlFilePersister",
						"Inline Method private initFigs() : void inlined to public AbstractFigNode(owner Object, bounds Rectangle, settings DiagramSettings) in class org.argouml.uml.diagram.deployment.ui.AbstractFigNode",
						"Inline Method private makeSubStatesIcon(x int, y int) : void inlined to private initFigs() : void in class org.argouml.uml.diagram.activity.ui.FigSubactivityState",
						"Inline Method private setTodoList(member AbstractProjectMember) : void inlined to public add(member ProjectMember) : boolean in class org.argouml.kernel.MemberList",
						"Inline Method private setTodoList(member AbstractProjectMember) : void inlined to public remove(member Object) : boolean in class org.argouml.kernel.MemberList",
						"Inline Method protected removeAllElementListeners(listener PropertyChangeListener) : void inlined to public removeAllElementListeners() : void in class org.argouml.notation.NotationProvider",
						"Inline Method appendArrays() inlined to public void loadRules() in class org.argouml.ui.explorer.PerspectiveManager");

		test.project("https://github.com/MatinMan/RefactoringDatasets.git", "junit")
				.atCommit("00e584db35fdb44b58eccaff7dc5ec6b0da7547a").containsOnly(
						"Inline Method	private ruleFields() : List<FrameworkField> inlined to private validateFields(errors List<Throwable>) : void in class org.junit.runners.BlockJUnit4ClassRunner");

		
		test.project("https://github.com/MatinMan/RefactoringDatasets.git", "ANTLR4")
		.atCommit("5587eebd3cb141b6ab10f394bf5ddcd47d86477c").containsOnly(
				
				"Inline Method public predictATN(dfa DFA, input TokenStream, outerContext ParserRuleContext) : int inlined to public adaptivePredict(input TokenStream, decision int, outerContext ParserRuleContext) : int in class org.antlr.v4.runtime.atn.ParserATNSimulator"
				);
		
		test.assertExpectations();

	}
}
