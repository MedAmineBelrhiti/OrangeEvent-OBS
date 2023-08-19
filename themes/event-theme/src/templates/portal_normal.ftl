<!DOCTYPE html>

<#include init />

<html class="${root_css_class}" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">

<head>
    <title>${html_title}</title>

    <meta content="initial-scale=1.0, width=device-width" name="viewport" />
<link href="https://cdn.jsdelivr.net" rel="preconnect" crossorigin="anonymous">
	<link href="https://cdn.jsdelivr.net/npm/boosted@5.2.3/dist/css/boosted.min.css" rel="stylesheet" integrity="sha384-zYFw+mxKy6r9zpAc1NoGiYBfQmxfvg7ONEMr81WeU+WLPPaLC9QTrNGFJTBi3EIn" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/boosted@5.2.3/dist/js/boosted.bundle.min.js" integrity="sha384-MANW37RG4MpFWPMCcNZBnvSobOkBpIGlbBkEzTtD4FbbOzJXbW8TddND1ak2lfsB" crossorigin="anonymous"></script>
    <@liferay_util["include"] page=top_head_include />
</head>

<body class="${css_class}">

<@liferay_ui["quick-access"] contentId="#main-content" />

<@liferay_util["include"] page=body_top_include />

<@liferay.control_menu />

<div class="container-fluid position-relative" id="wrapper">
        <#include "${full_templates_path}/top-navbar.ftl"/>
    <section id="content">
        <h2 class="hide-accessible sr-only" role="heading" aria-level="1">${htmlUtil.escape(the_title)}</h2>
        <#if selectable>
            <@liferay_util["include"] page=content_include />
        <#else>
            ${portletDisplay.recycle()}

            ${portletDisplay.setTitle(the_title)}

            <@liferay_theme["wrap-portlet"] page="portlet.ftl">
                <@liferay_util["include"] page=content_include />
            </@>
        </#if>
    </section>

    <footer id="footer" role="contentinfo">
        <p class="powered-by">
            <#include "${full_templates_path}/footer.ftl"/>
        </p>
    </footer>
</div>

<@liferay_util["include"] page=body_bottom_include />

<@liferay_util["include"] page=bottom_include />

</body>

</html>