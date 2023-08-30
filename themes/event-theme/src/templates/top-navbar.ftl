<header>
    <nav class="navbar navbar-dark bg-dark navbar-expand-lg" aria-label="Global navigation - With one line title example">
        <div class="container-xxl">

            <!-- Orange brand logo -->
            <div class="navbar-brand me-auto me-lg-4">
                <a class="stretched-link" href="#">
                    <img src="${themeDisplay.getPathThemeImages()}/orange-logo.svg" width="50" height="50" loading="lazy">
                </a>
                <h1 class="title">Orange Event</h1>
            </div>

            <!-- Burger menu (visible on small screens) -->
            <button class="navbar-toggler collapsed" type="button" data-bs-toggle="collapse" data-bs-target=".global-header-1" aria-controls="global-header-1.1 global-header-1.2" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
                    <#if themeDisplay.isSignedIn()>
                        <#include "${full_templates_path}/navigation.ftl"/>
                    </#if>

            <!-- Navbar with action icons -->
            <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                <div class="right-top-navbar text-right">
                    <ul class="list-inline mb-0">
                        <#if is_signed_in>
                            <li class="list-inline-item py-2">
                                <a href="javascript:void(0)">
                                    ${user.getFullName()}
                                </a>
                            </li>
                            <li class="list-inline-item py-2">
                                <a href="${sign_out_url}">${sign_out_text}</a>
                            </li>
                        <#else>
                            <li class="list-inline-item py-2">
                                <a href="#">Guest User</a>
                            </li>
                        </#if>
                    </ul>
                </div>
            </div>
        </div>
    </nav>
</header>