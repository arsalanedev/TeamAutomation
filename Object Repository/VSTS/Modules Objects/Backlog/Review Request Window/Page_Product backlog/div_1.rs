<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_1</name>
   <tag></tag>
   <elementGuidId>197d82c7-3ac0-48f7-b876-36da5a8b67b0</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
        
            
                
                    
                        1
                    
                
                
                    
                        
                            
                                
                                    Select Reviewers
                                    The people you select will receive an email request to provide feedback.
                                
                            
                            
                                
                                    
                                        
	kendo.syncReady(function(){jQuery(&quot;#rvm-req-stakehohermultiselect&quot;).kendoMultiSelect({&quot;change&quot;:rvmReqDialogStakeHolder.onStakeholderMultiselectChange,&quot;open&quot;:rvmReqDialogStakeHolder.onStakeholderMultiselectOpen,&quot;dataTextField&quot;:&quot;DisplayName&quot;,&quot;autoBind&quot;:false,&quot;dataValueField&quot;:&quot;uid&quot;});});

                                    
                                    
                                        
	kendo.syncReady(function(){jQuery(&quot;#rvm-req-stakeholdercombobox&quot;).kendoComboBox({&quot;change&quot;:rvmReqDialogStakeHolder.onStakeHolderComboChange,&quot;select&quot;:rvmReqDialogStakeHolder.onStakeHolderComboSelect,&quot;dataBound&quot;:rvmReqDialogStakeHolder.onStakeHolderComboDatabound,&quot;open&quot;:rvmReqDialogStakeHolder.onStakeHolderComboOpen,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/Common/ServerFilteringGetStakeHolder&quot;,&quot;data&quot;:function(e) {return rvmReqDialogStakeHolder.getStakeHolderComboTextAndMultiSelectNames();}},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}},&quot;dataTextField&quot;:&quot;DisplayName&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;footerTemplate&quot;:&quot;\u003cdiv id=\u0027rvm-req-stakeholdercombobox-footer-showResult\u0027 style=\u0027height:20px;color: rgb(102, 102, 102);padding-left: 4px;padding-top: 4px\u0027\u003e \u003c/div\u003e&quot;,&quot;autoBind&quot;:false,&quot;dataValueField&quot;:&quot;EmailAddress&quot;,&quot;placeholder&quot;:&quot;Select users&quot;});});

                                    
                                    
                                    
                                
                            
                        
                    
                
            

            
                
                    
                        2
                    
                
                
                    
                        
                            
                                
                                    Select Approvers
                                    The people you select will receive an email request to provide feedback and approval.
                                
                            
                            
                                
                                    
                                        
	kendo.syncReady(function(){jQuery(&quot;#rvm-req-approversmultiselect&quot;).kendoMultiSelect({&quot;change&quot;:rvmReqDialogApprover.onApproverMultiselectChange,&quot;open&quot;:rvmReqDialogApprover.onApproverMultiselectOpen,&quot;dataTextField&quot;:&quot;DisplayName&quot;,&quot;autoBind&quot;:false,&quot;dataValueField&quot;:&quot;uid&quot;});});

                                    
                                    
                                        
	kendo.syncReady(function(){jQuery(&quot;#rvm-req-approverscombobox&quot;).kendoComboBox({&quot;change&quot;:rvmReqDialogApprover.onApproverComboChange,&quot;select&quot;:rvmReqDialogApprover.onApproverComboSelect,&quot;dataBound&quot;:rvmReqDialogApprover.onApproverComboDatabound,&quot;open&quot;:rvmReqDialogApprover.onApproverComboOpen,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/Common/ServerFilteringGetStakeHolder&quot;,&quot;data&quot;:function(e){return rvmReqDialogApprover.getApproverComboTextAndMultiSelectNames();}},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}},&quot;dataTextField&quot;:&quot;DisplayName&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;footerTemplate&quot;:&quot;\u003cdiv id=\u0027rvm-req-approvercombobox-footer-showResult\u0027 style=\u0027height:20px;color: rgb(102, 102, 102);padding-left: 4px;padding-top: 4px\u0027\u003e \u003c/div\u003e&quot;,&quot;autoBind&quot;:false,&quot;dataValueField&quot;:&quot;EmailAddress&quot;,&quot;placeholder&quot;:&quot;Select users&quot;});});

                                    












                        3
                    
                
                

                        

                                
Request Review For You can give a single Review Request against one or more work item(s).
                                
                            
                            

                                    
Subject
                                        
	kendo.syncReady(function(){jQuery(&quot;#rvm-req-workitremtitletxtbox&quot;).kendoMaskedTextBox({&quot;rules&quot;:{}});});

                                        
                                            Title of review item
                                        
                                    
                                    
                                        Purpose

BoldItalicUnderlineInsert hyperlinkRemove hyperlinkIndentOutdentInsert ordered listInsert unordered list
	kendo.syncReady(function(){jQuery(&quot;#rvm-req-workitemdesctxtbox&quot;).kendoEditor({&quot;tools&quot;:[{&quot;name&quot;:&quot;bold&quot;},{&quot;name&quot;:&quot;italic&quot;},{&quot;name&quot;:&quot;underline&quot;},{&quot;name&quot;:&quot;createLink&quot;},{&quot;name&quot;:&quot;unlink&quot;},{&quot;name&quot;:&quot;indent&quot;},{&quot;name&quot;:&quot;outdent&quot;},{&quot;name&quot;:&quot;insertOrderedList&quot;},{&quot;name&quot;:&quot;insertUnorderedList&quot;}]});});

                                                                    
	kendo.syncReady(function(){jQuery(&quot;#rvm-wides-panelbar&quot;).kendoPanelBar({&quot;expandMode&quot;:&quot;multiple&quot;});});

                                    

                                
                            
                        
                    
                
            

            
                
                
                
                    
                        
                            
                                
                                    Add Work Item
                                    10 work item(s) added.
                                
                            
                            
                                

                                    

                                        
                                            
Add Work Item 
	kendo.syncReady(function(){jQuery(&quot;#reqWorkItemGridToolbarMenu&quot;).kendoMenu({&quot;select&quot;:rvmReqDialogReviewItem.onReqReviewWIGridMenuItemClick});});

                                            
                                            

                                            
                                                        IDWork Item TypeTitleStateRev. ID420User StoryTestWI1New2421User StoryTestWI2New2422User StoryTestWI3New2423User StoryTestWI4New2424User StoryTestWI5New2425User StoryTestWI6New2426User StoryTestWI7New2427User StoryTestWI8New2428User StoryTestWI9New2429User StoryTestWI10New2
	kendo.syncReady(function(){jQuery(&quot;#rvm-req-workitemgrid&quot;).kendoGrid({&quot;dataBound&quot;:rvmReqDialogReviewItem.onGridDataBound,&quot;columns&quot;:[{&quot;title&quot;:&quot;ID&quot;,&quot;headerAttributes&quot;:{&quot;title&quot;:&quot;ID&quot;,&quot;data-field&quot;:&quot;WorkItemId&quot;,&quot;data-title&quot;:&quot;ID&quot;},&quot;width&quot;:&quot;80px&quot;,&quot;field&quot;:&quot;WorkItemId&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Work Item Type&quot;,&quot;headerAttributes&quot;:{&quot;title&quot;:&quot;Work\u0026#32;Item\u0026#32;Type&quot;,&quot;data-field&quot;:&quot;WorkItemType&quot;,&quot;data-title&quot;:&quot;Work\u0026#32;Item\u0026#32;Type&quot;},&quot;width&quot;:&quot;200px&quot;,&quot;field&quot;:&quot;WorkItemType&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Title&quot;,&quot;headerAttributes&quot;:{&quot;title&quot;:&quot;Title&quot;,&quot;data-field&quot;:&quot;WorkItemTitle&quot;,&quot;data-title&quot;:&quot;Title&quot;},&quot;field&quot;:&quot;WorkItemTitle&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;State&quot;,&quot;headerAttributes&quot;:{&quot;title&quot;:&quot;State&quot;,&quot;data-field&quot;:&quot;State&quot;,&quot;data-title&quot;:&quot;State&quot;},&quot;field&quot;:&quot;State&quot;,&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Rev. ID&quot;,&quot;headerAttributes&quot;:{&quot;title&quot;:&quot;Rev.\u0026#32;ID&quot;,&quot;data-field&quot;:&quot;RevisionNumber&quot;,&quot;data-title&quot;:&quot;Rev.\u0026#32;ID&quot;},&quot;width&quot;:&quot;80px&quot;,&quot;field&quot;:&quot;RevisionNumber&quot;,&quot;encoded&quot;:true}],&quot;sortable&quot;:true,&quot;selectable&quot;:&quot;Multiple, Row&quot;,&quot;resizable&quot;:true,&quot;reorderable&quot;:true,&quot;scrollable&quot;:{&quot;virtual&quot;:true,&quot;height&quot;:&quot;200px&quot;},&quot;toolbar&quot;:{},&quot;messages&quot;:{&quot;noRecords&quot;:&quot;No records available.&quot;},&quot;autoBind&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:50,&quot;page&quot;:1,&quot;total&quot;:0,&quot;requestStart&quot;:rvmReqDialogReviewItem.onGridDataRequestStart,&quot;requestEnd&quot;:rvmReqDialogReviewItem.onGridDataRequestEnd,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;Selected&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;WorkItemId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;RevisionNumber&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;WorkItemTitle&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;WorkItemType&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;State&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;RevisedDate&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;RevisedDateTime&quot;:{&quot;type&quot;:&quot;date&quot;},&quot;StatusCode&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;AreaPath&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Iteration&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;IsVisible&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;Estimation&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Children&quot;:{&quot;type&quot;:&quot;object&quot;}}}}},&quot;navigatable&quot;:true});});

                                    
                                
                            
                        
                    
                
            

            
                
                    
                        4
                    
                
                
                    
                        
                            
                                
                                    Select Area Path 
                                    Feedback Request and Feedback Response work items will create under the Area Path you select here.
                                
                            
                            
                                
                                    
                                        
                                    
                                
                            
                        
                    
                
            

            
                
                    
                        5
                    
                
                
                    
                        
                            
                                
                                    Select Due Date
                                
                            
                            
                                
                                    
                                        Due Date                                       
                                        
	kendo.syncReady(function(){jQuery(&quot;#rvm-req-datepicker&quot;).kendoDatePicker({&quot;change&quot;:rvmReqDialogReviewItem.onDueDateChange,&quot;format&quot;:&quot;MM/dd/yyyy&quot;,&quot;min&quot;:new Date(2018,2,21,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

                                    
                                
                            
                        
                    
                
            

                
                    
                        
                            6
                        
                    
                    
                        
                            
                                
                                    
                                        Rules
                                    
                                

                                    
                                        
                                            


                                                    Approve as package (not individually)
                                                    
                                                                                                    Ask user for password on approval
                                                    
                                            
                                        
                                    

                                    
                                        
                                            Pre state
                                            Select
	kendo.syncReady(function(){jQuery(&quot;#rvm-prestate-ddl&quot;).kendoDropDownList({&quot;change&quot;:rvmReqDialogReviewItem.onPreStateDdlChange,&quot;dataBound&quot;:rvmReqDialogReviewItem.onPreStateDdlDataBound,&quot;optionLabel&quot;:&quot;Select&quot;});});

                                        
                                    
                                    
                                        
                                            Post state
                                            Select
	kendo.syncReady(function(){jQuery(&quot;#rvm-poststate-ddl&quot;).kendoDropDownList({&quot;change&quot;:rvmReqDialogReviewItem.onPostStateDdlChange,&quot;dataBound&quot;:rvmReqDialogReviewItem.onPostStateDdlDataBound,&quot;open&quot;:rvmReqDialogReviewItem.onPostStateDdlOpen,&quot;optionLabel&quot;:&quot;Select&quot;});});

                                        
                                    
                                    
                                        
                                            Change state
                                            
	kendo.syncReady(function(){jQuery(&quot;#rvm-changevalue-ddl&quot;).kendoDropDownList({&quot;change&quot;:rvmReqDialogReviewItem.onChangeValueDdlChange,&quot;dataBound&quot;:rvmReqDialogReviewItem.onChangeValueDdlDataBound,&quot;dataSource&quot;:[{&quot;Text&quot;:&quot;When a given work item is approved by all approvers&quot;,&quot;Value&quot;:&quot;OnSingleItem&quot;},{&quot;Text&quot;:&quot;When all the work items are approved by all approvers&quot;,&quot;Value&quot;:&quot;OnAllItems&quot;}],&quot;dataTextField&quot;:&quot;Text&quot;,&quot;dataValueField&quot;:&quot;Value&quot;});});

                                        
                                    

                            
                        
                    
                


        
    </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;rvm-req-maincontainer&quot;)/div[3]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>ref_element</name>
      <type>Main</type>
      <value>Object Repository/VSTS/Modules Objects/Backlog/Review Request Window/Page_Product backlog/iframe_externalContentHost570</value>
   </webElementProperties>
</WebElementEntity>
