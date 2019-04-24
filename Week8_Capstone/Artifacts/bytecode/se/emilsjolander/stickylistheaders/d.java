class se.emilsjolander.stickylistheaders.d extends se.emilsjolander.stickylistheaders.a implements android.widget.SectionIndexer {
  android.widget.SectionIndexer b;

  se.emilsjolander.stickylistheaders.d(android.content.Context, se.emilsjolander.stickylistheaders.e);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #12                 // Method se/emilsjolander/stickylistheaders/a."<init>":(Landroid/content/Context;Lse/emilsjolander/stickylistheaders/e;)V
       6: aload_0
       7: aload_2
       8: checkcast     #6                  // class android/widget/SectionIndexer
      11: putfield      #14                 // Field b:Landroid/widget/SectionIndexer;
      14: return

  public int getPositionForSection(int);
    Code:
       0: aload_0
       1: getfield      #14                 // Field b:Landroid/widget/SectionIndexer;
       4: iload_1
       5: invokeinterface #19,  2           // InterfaceMethod android/widget/SectionIndexer.getPositionForSection:(I)I
      10: ireturn

  public int getSectionForPosition(int);
    Code:
       0: aload_0
       1: getfield      #14                 // Field b:Landroid/widget/SectionIndexer;
       4: iload_1
       5: invokeinterface #22,  2           // InterfaceMethod android/widget/SectionIndexer.getSectionForPosition:(I)I
      10: ireturn

  public java.lang.Object[] getSections();
    Code:
       0: aload_0
       1: getfield      #14                 // Field b:Landroid/widget/SectionIndexer;
       4: invokeinterface #26,  1           // InterfaceMethod android/widget/SectionIndexer.getSections:()[Ljava/lang/Object;
       9: areturn
}
