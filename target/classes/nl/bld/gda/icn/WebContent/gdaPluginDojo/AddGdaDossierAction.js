define(["dojo/_base/declare", "ecm/model/Action"],
	function(declare, Action) {

	/**
	 * @name gdaPluginDojo.AddGdaDossierAction
	 * @class Describes a user-executable action. Used to override the standard code for enabling/disabling
	 * menu actions.
	 * @augments ecm.model.Action
	 */
	return declare("gdaPluginDojo.AddGdaDossierAction", [ Action ], {
	/** @lends gdaPluginDojo.AddGdaDossierAction.prototype */
	
		/**
		 * Returns true if this action should be enabled for the given repository, list type, and items.
		 */
		isEnabled: function(repository, listType, items, teamspace, resultSet) {
			var enabled = this.inherited(arguments);
			 //TODO: logic to handle
             enabled=true;
			return enabled;
		},
	
		/**
		 * Returns true if this action should be visible for the given repository and list type.
		 */
		isVisible: function(repository, listType) {
			 var visible=this.inherited(arguments);
             //TODO: logic to handle
             visible=true;
             return visible;
		},


        addGdaDossierAction: function(){
          //TODO
          console.log("addGdaDossierAction");
          debugger;
        }

	});
});