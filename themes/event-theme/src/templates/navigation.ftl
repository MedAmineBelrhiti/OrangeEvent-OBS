<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
        <#list nav_items as nav_item>
            <#assign
            nav_item_attr_has_popup = ""
            nav_item_css_class = "nav_child_css_class"
            nav_item_layout = nav_item.getLayout()
            />

            <#if nav_item.isSelected()>
                <#assign
                nav_item_attr_has_popup = "aria-haspopup='true'"
                nav_item_css_class = "nav_child_css_class"
                />
            </#if>
                <a class="nav-link" ${nav_item_attr_has_popup} href="${nav_item.getURL()}" ${nav_item.getTarget()} role="menuitem"><span><@liferay_theme["layout-icon"] layout=nav_item_layout /> ${nav_item.getName()}</span></a>

                <#if nav_item.hasChildren()>
                    <ul class="child-menu" role="menu">
                        <#list nav_item.getChildren() as nav_child>
                            <#assign
                            nav_child_css_class = "nav_child_css_class"
                            />

                            <#if nav_item.isSelected()>
                                <#assign
                                nav_child_css_class = "nav_child_css_class"
                                />
                            </#if>

                            <li class="${nav_child_css_class}" id="layout_${nav_child.getLayoutId()}" role="presentation">
                                <a class="nav-link" href="${nav_child.getURL()}" ${nav_child.getTarget()} role="menuitem">${nav_child.getName()}</a>
                            </li>
                        </#list>
                    </ul>
                </#if>
            </li>
        </#list>
      </ul>
    </div>
  </div>
</nav>