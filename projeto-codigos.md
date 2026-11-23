# Códigos do projeto

> Arquivos textuais reunidos automaticamente a partir do estado atual do projeto.

## `.gitattributes`

```text
/gradlew text eol=lf
*.bat text eol=crlf
*.jar binary

```

## `.gitignore`

```text
.gradle
build/
!gradle/wrapper/gradle-wrapper.jar
!**/src/main/**/build/
!**/src/test/**/build/

### STS ###
.apt_generated
.classpath
.factorypath
.project
.settings
.springBeans
.sts4-cache
bin/
!**/src/main/**/bin/
!**/src/test/**/bin/

### IntelliJ IDEA ###
.idea
*.iws
*.iml
*.ipr
out/
!**/src/main/**/out/
!**/src/test/**/out/

### NetBeans ###
/nbproject/private/
/nbbuild/
/dist/
/nbdist/
/.nb-gradle/

### VS Code ###
.vscode/

```

## `.idea/.gitignore`

```text
# Default ignored files
/shelf/
/workspace.xml
# Ignored default folder with query files
/queries/
# Datasource local storage ignored files
/dataSources/
/dataSources.local.xml
# Editor-based HTTP Client requests
/httpRequests/

```

## `.idea/.name`

```text
if-project
```

## `.idea/compiler.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="CompilerConfiguration">
    <bytecodeTargetLevel target="25" />
  </component>
  <component name="JavacSettings">
    <option name="ADDITIONAL_OPTIONS_STRING" value="-parameters" />
  </component>
</project>
```

## `.idea/gradle.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="GradleMigrationSettings" migrationVersion="1" />
  <component name="GradleSettings">
    <option name="linkedExternalProjectsSettings">
      <GradleProjectSettings>
        <option name="externalProjectPath" value="$PROJECT_DIR$" />
        <option name="modules">
          <set>
            <option value="$PROJECT_DIR$" />
          </set>
        </option>
      </GradleProjectSettings>
    </option>
  </component>
</project>
```

## `.idea/misc.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="ExternalStorageConfigurationManager" enabled="true" />
  <component name="FrameworkDetectionExcludesConfiguration">
    <file type="web" url="file://$PROJECT_DIR$" />
  </component>
  <component name="ProjectRootManager" version="2" languageLevel="JDK_25" default="true" project-jdk-name="openjdk-25" project-jdk-type="JavaSDK" />
</project>
```

## `.idea/vcs.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="VcsDirectoryMappings">
    <mapping directory="" vcs="Git" />
  </component>
</project>
```

## `.idea/workspace.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="AutoImportSettings">
    <option name="autoReloadType" value="SELECTIVE" />
  </component>
  <component name="ChangeListManager">
    <list default="true" id="aebdcd20-8630-4de0-b891-a375a7cb9023" name="Changes" comment="">
      <change beforePath="$PROJECT_DIR$/build.gradle" beforeDir="false" afterPath="$PROJECT_DIR$/build.gradle" afterDir="false" />
      <change beforePath="$PROJECT_DIR$/src/main/java/br/edu/ifce/mn/ads/ifproject/users/application/controllers/UserController.java" beforeDir="false" afterPath="$PROJECT_DIR$/src/main/java/br/edu/ifce/mn/ads/ifproject/users/application/controllers/UserController.java" afterDir="false" />
      <change beforePath="$PROJECT_DIR$/src/main/java/br/edu/ifce/mn/ads/ifproject/users/infra/repositories/IUserRepository.java" beforeDir="false" afterPath="$PROJECT_DIR$/src/main/java/br/edu/ifce/mn/ads/ifproject/users/infra/repositories/IUserRepository.java" afterDir="false" />
      <change beforePath="$PROJECT_DIR$/src/main/java/br/edu/ifce/mn/ads/ifproject/users/infra/repositories/UserRepository.java" beforeDir="false" afterPath="$PROJECT_DIR$/src/main/java/br/edu/ifce/mn/ads/ifproject/users/infra/repositories/UserRepository.java" afterDir="false" />
      <change beforePath="$PROJECT_DIR$/src/main/resources/application.yaml" beforeDir="false" afterPath="$PROJECT_DIR$/src/main/resources/application.yaml" afterDir="false" />
      <change beforePath="$PROJECT_DIR$/src/main/resources/schema.sql" beforeDir="false" afterPath="$PROJECT_DIR$/src/main/resources/schema.sql" afterDir="false" />
    </list>
    <option name="SHOW_DIALOG" value="false" />
    <option name="HIGHLIGHT_CONFLICTS" value="true" />
    <option name="HIGHLIGHT_NON_ACTIVE_CHANGELIST" value="false" />
    <option name="LAST_RESOLUTION" value="IGNORE" />
  </component>
  <component name="CopilotPersistence">
    <persistenceIdMap>
      <entry key="_/home/mateus/IdeaProjects/if-projects-ads-2026.1-api" value="3LxiAJinTpcKVppaAg6T0TqRGvl" />
    </persistenceIdMap>
  </component>
  <component name="EmbeddingIndexingInfo">
    <option name="cachedIndexableFilesCount" value="167" />
  </component>
  <component name="ExternalProjectsData">
    <projectState path="$PROJECT_DIR$">
      <ProjectState />
    </projectState>
  </component>
  <component name="ExternalProjectsManager">
    <system id="GRADLE">
      <state>
        <projects_view>
          <tree_state>
            <expand>
              <path>
                <item name="" type="6a2764b6:ExternalProjectsStructure$RootNode" />
                <item name="if-project" type="f1a62948:ProjectNode" />
              </path>
            </expand>
            <select />
          </tree_state>
        </projects_view>
      </state>
    </system>
  </component>
  <component name="Git.Settings">
    <option name="RECENT_GIT_ROOT_PATH" value="$PROJECT_DIR$" />
  </component>
  <component name="GitHubPullRequestSearchHistory">{
  &quot;lastFilter&quot;: {
    &quot;state&quot;: &quot;OPEN&quot;,
    &quot;assignee&quot;: &quot;mattheosL&quot;
  }
}</component>
  <component name="GithubPullRequestsUISettings">{
  &quot;selectedUrlAndAccountId&quot;: {
    &quot;url&quot;: &quot;https://github.com/ifce-prof-thiago/if-projects-ads-2026.1-api.git&quot;,
    &quot;accountId&quot;: &quot;0fbc1c46-def9-4f26-9f5d-0647da58e479&quot;
  }
}</component>
  <component name="McpProjectServerCommands">
    <commands />
    <urls />
  </component>
  <component name="ProjectColorInfo">{
  &quot;associatedIndex&quot;: 8
}</component>
  <component name="ProjectId" id="3Lxi9woDHYz3JUzw6INdk72c1Uq" />
  <component name="ProjectSessionTemplates">
    <option name="panelTemplate">
      <template>
        <option name="modeId" value="Agent" />
        <option name="model">
          <model>
            <option name="modelType" value="builtin_id" />
            <option name="modelValue" value="auto" />
          </model>
        </option>
        <option name="targetType" value="BACKGROUND" />
        <option name="worktreeMode" value="WORKSPACE" />
      </template>
    </option>
  </component>
  <component name="ProjectViewState">
    <option name="hideEmptyMiddlePackages" value="true" />
    <option name="showLibraryContents" value="true" />
  </component>
  <component name="PropertiesComponent">{
  &quot;keyToString&quot;: {
    &quot;Gradle.Build if-projects-ads-2026.1-api.executor&quot;: &quot;Run&quot;,
    &quot;ModuleVcsDetector.initialDetectionPerformed&quot;: &quot;true&quot;,
    &quot;RequestMappingsPanelOrder0&quot;: &quot;0&quot;,
    &quot;RequestMappingsPanelOrder1&quot;: &quot;1&quot;,
    &quot;RequestMappingsPanelWidth0&quot;: &quot;75&quot;,
    &quot;RequestMappingsPanelWidth1&quot;: &quot;75&quot;,
    &quot;RunOnceActivity.MCP Project settings loaded&quot;: &quot;true&quot;,
    &quot;RunOnceActivity.ShowReadmeOnStart&quot;: &quot;true&quot;,
    &quot;RunOnceActivity.TerminalTabsStorage.copyFrom.TerminalArrangementManager.252&quot;: &quot;true&quot;,
    &quot;RunOnceActivity.git.unshallow&quot;: &quot;true&quot;,
    &quot;RunOnceActivity.typescript.service.memoryLimit.init&quot;: &quot;true&quot;,
    &quot;Spring Boot.Startup.executor&quot;: &quot;Run&quot;,
    &quot;com.intellij.ml.llm.matterhorn.ej.ui.settings.DefaultModelSelectionForGA.v1&quot;: &quot;true&quot;,
    &quot;copilot.chat.legacySessionMetadata.migrated&quot;: &quot;true&quot;,
    &quot;git-widget-placeholder&quot;: &quot;develop&quot;,
    &quot;junie.onboarding.icon.badge.shown&quot;: &quot;true&quot;,
    &quot;kotlin-language-version-configured&quot;: &quot;true&quot;,
    &quot;last_opened_file_path&quot;: &quot;/home/mateus/IdeaProjects/if-projects-ads-2026.1-api&quot;,
    &quot;node.js.detected.package.eslint&quot;: &quot;true&quot;,
    &quot;node.js.detected.package.tslint&quot;: &quot;true&quot;,
    &quot;node.js.selected.package.eslint&quot;: &quot;(autodetect)&quot;,
    &quot;node.js.selected.package.tslint&quot;: &quot;(autodetect)&quot;,
    &quot;nodejs_package_manager_path&quot;: &quot;npm&quot;,
    &quot;settings.editor.selected.configurable&quot;: &quot;preferences.lookFeel&quot;,
    &quot;to.speed.mode.migration.done&quot;: &quot;true&quot;,
    &quot;vue.rearranger.settings.migration&quot;: &quot;true&quot;
  }
}</component>
  <component name="RunManager">
    <configuration name="Startup" type="SpringBootApplicationConfigurationType" factoryName="Spring Boot" nameIsGenerated="true">
      <option name="FRAME_DEACTIVATION_UPDATE_POLICY" value="UpdateClassesAndResources" />
      <module name="if-project.main" />
      <option name="SPRING_BOOT_MAIN_CLASS" value="br.edu.ifce.mn.ads.ifproject.Startup" />
      <method v="2">
        <option name="Make" enabled="true" />
      </method>
    </configuration>
  </component>
  <component name="SharedIndexes">
    <attachedChunks>
      <set>
        <option value="bundled-jdk-30f59d01ecdd-2fc7cc6b9a17-intellij.indexing.shared.core-IU-253.30387.90" />
        <option value="bundled-js-predefined-d6986cc7102b-9b0f141eb926-JavaScript-IU-253.30387.90" />
      </set>
    </attachedChunks>
  </component>
  <component name="TaskManager">
    <task active="true" id="Default" summary="Default task">
      <changelist id="aebdcd20-8630-4de0-b891-a375a7cb9023" name="Changes" comment="" />
      <created>1770524860642</created>
      <option name="number" value="Default" />
      <option name="presentableId" value="Default" />
      <updated>1770524860642</updated>
      <workItem from="1794401975805" duration="2250000" />
      <workItem from="1794404237720" duration="1971000" />
    </task>
    <servers />
  </component>
  <component name="TypeScriptGeneratedFilesManager">
    <option name="version" value="3" />
  </component>
</project>
```

## `HELP.md`

```markdown
# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/4.0.5/gradle-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/4.0.5/gradle-plugin/packaging-oci-image.html)
* [Spring Data JDBC](https://docs.spring.io/spring-boot/4.0.5/reference/data/sql.html#data.sql.jdbc)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/4.0.5/reference/using/devtools.html)
* [Spring Web](https://docs.spring.io/spring-boot/4.0.5/reference/web/servlet.html)

### Guides

The following guides illustrate how to use some features concretely:

* [Using Spring Data JDBC](https://github.com/spring-projects/spring-data-examples/tree/main/jdbc/basics)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)


```

## `README.md`

```markdown
#Equipes

Equipe 1:
- Yasmim, Nicole, Isabeli e Carlos Samuel
- auth

Equipe 2:
- Yuri e Pedro Victor
- boards

Equipe 3:
- Guilherme, Wanderson, Gustavo e Otávio
- tasks

Equipe 4:
- Calil, Samuel Honorato, Robson e Tainah
- tasks_groups

Equipe 5:
- Victor, Lara, Fernanda e Jefferson
- subtasks

Equipe 6:
- Mateus, Davdson, Samuel Silva e Neto
- projects

4 --> auth
3 --> boards
6 --> projects
1 --> subtasks
2 -->  tasks
5 -->  tasks_groups
```

## `build.gradle`

```groovy
plugins {
    id 'java'
    id 'org.springframework.boot' version '4.0.5'
    id 'io.spring.dependency-management' version '1.1.7'
}

group = 'br.edu.ifce.mn.ads'
version = '0.0.1'
description = 'if-project'

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:3.0.3")
    implementation 'org.springframework.boot:spring-boot-starter-validation'
    implementation 'org.springframework.boot:spring-boot-starter-data-jdbc'
    implementation 'org.springframework.boot:spring-boot-starter-webmvc'
    implementation 'org.springframework.boot:spring-boot-starter-security'
    implementation 'io.jsonwebtoken:jjwt-api:0.12.6'
    runtimeOnly 'io.jsonwebtoken:jjwt-impl:0.12.6'
    runtimeOnly 'io.jsonwebtoken:jjwt-jackson:0.12.6'
    developmentOnly 'org.springframework.boot:spring-boot-devtools'
    runtimeOnly 'org.postgresql:postgresql'
    implementation 'org.flywaydb:flyway-database-postgresql'
    testImplementation 'org.springframework.boot:spring-boot-starter-data-jdbc-test'
    testImplementation 'org.springframework.boot:spring-boot-starter-webmvc-test'
    testRuntimeOnly 'org.junit.platform:junit-platform-launcher'
}

tasks.named('test') {
    useJUnitPlatform()
}

```

## `docs/API_FRONTEND.md`

```markdown
# Integração com o frontend

Use a URL base configurada no ambiente do frontend, por exemplo `http://localhost:8080`.
Todos os endpoints protegidos usam o header abaixo; `X-User-Id` não é aceito como autenticação.

```http
Authorization: Bearer <accessToken>
Content-Type: application/json
```

## Autenticação

`POST /api/v1/auth/login`

```json
{
  "email": "ana@example.com",
  "password": "senha-segura"
}
```

Resposta `200 OK`:

```json
{
  "id": "b6d09472-9a75-4b02-91f7-e7df2ad293e3",
  "username": "ana",
  "email": "ana@example.com",
  "accessToken": "eyJhbGciOiJIUzI1NiJ9...",
  "tokenType": "Bearer",
  "expiresIn": 86400,
  "refreshToken": "fP8Q..."
}
```

Envie o `accessToken` em todas as chamadas protegidas. Quando ele expirar, envie o `refreshToken` para `POST /api/v1/auth/refresh`; o token de refresh é de uso único e a resposta traz um novo par de tokens. O endpoint legado `POST /api/v1/users/login` continua disponível temporariamente, mas novos clientes devem usar `/api/v1/auth/login`.

```json
{ "refreshToken": "fP8Q..." }
```

## Rotas normalizadas

| Recurso | Base |
| --- | --- |
| Usuários | `/api/v1/users` |
| Projetos | `/api/v1/projects` |
| Quadros | `/api/v1/boards` |
| Grupos de tarefas | `/api/v1/task-groups` |
| Tarefas | `/api/v1/tasks` |
| Subtarefas | `/api/v1/subtasks` |

As IDs de usuários, projetos, quadros, grupos, tarefas e subtarefas são UUIDs.

## Subtarefas

Criação: `POST /api/v1/subtasks`

```json
{
  "taskId": "dc5fd837-2e7c-47b5-afb1-c9e1fba02ec6",
  "description": "Revisar integração",
  "position": 0
}
```

Listagem: `GET /api/v1/subtasks/task-groups/{taskId}`. A resposta sempre é uma lista JSON, inclusive quando vazia.

Atualização de texto: `PATCH /api/v1/subtasks/{subtaskId}/description`

```json
{ "description": "Descrição atualizada" }
```

Atualização de conclusão: `PATCH /api/v1/subtasks/{subtaskId}/completion`

```json
{ "completed": true }
```

Para alternar o status sem enviar corpo, use `PATCH /api/v1/subtasks/{subtaskId}/toggle`. Para converter em tarefa, envie `POST /api/v1/subtasks/conversion`:

```json
{
  "subtaskId": "dc5fd837-2e7c-47b5-afb1-c9e1fba02ec6",
  "title": "Nova tarefa",
  "description": "Detalhes da tarefa",
  "priority": "MEDIUM",
  "dueDate": "2026-12-10T17:00:00-03:00"
}
```

## Erros

Erros usam um formato único:

```json
{
  "status": 400,
  "error": "Bad Request",
  "message": "Dados inválidos",
  "timestamp": "2026-11-22T20:00:00Z",
  "fields": { "email": "Informe um e-mail válido" }
}
```

## CORS e ambientes

Em desenvolvimento, Vite (`5173`) e servidores locais (`3000`) já são permitidos. Para outro frontend, configure a variável de ambiente `CORS_ALLOWED_ORIGINS` como uma lista separada por vírgula. Em produção, configure também `JWT_SECRET` com uma chave forte e exclusiva.

```

## `docs/Arquitetura - Padrão Arquitetural.drawio.svg`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!-- Do not edit this file with editors other than diagrams.net -->
<!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd">
<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" width="786px" height="622px" viewBox="-0.5 -0.5 786 622" content="&lt;mxfile host=&quot;drawio-plugin&quot; modified=&quot;2026-03-21T11:27:31.419Z&quot; agent=&quot;Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36&quot; etag=&quot;V9BXKs1TZeqqp8czJj-V&quot; version=&quot;22.1.22&quot; type=&quot;embed&quot;&gt;&lt;diagram id=&quot;23iRSUPoRavnBvh4doch&quot; name=&quot;Padrão Arquitetural&quot;&gt;7Vxdd6o4F/4t74VrvXNRFkn4vLRKe1yrrY4f78y56kJIlSmCA9jW8+vfBAICiUp7UNsz442wEyLZz947T3YSO6i3eruN7PXyPnSx34Gy+9ZB/Q6EQFF08kUlWybRoZpJFpHnMtlOMPF+YCaUmXTjuTiuVEzC0E+8dVXohEGAnaQis6MofK1Wewr96q+u7QXmBBPH9nnpH56bLDOpAfWd/Bv2Fsv8l4FmZiUrO6/MehIvbTd8LYmQ1UG9KAyT7Gr11sM+1V6ul+y5mz2lxYtFOEiaPABR9sSL7W9Y59iLJdu8ty84SjzS+Tt7jv1RGHuJFwakaB4mSbjqoOu8Qtf3FrQgCddEukxWPrkB5JL0ck0bW70tqEVIczv2HGltJwmOghvP98cpStdP5HLCftj17AV9NMGksb5alEbhc6F0WYIVeS/0wyh9aeSmH1Zaks9tx3BR2nDtCYgURaVP8DpkaqX9xG8lEdPpLQ5XOIm2pAor1Rm8uYEjJbt/3VmLxqosS4YCDY0ZKTPQRdHyDkNywWAUQ4p4SCffumOrzwFLOpNUgbIZgg7pOo4E0K4816WPX0c49n7Y87QpmdyvQy9I0rdWrztqn7a1SYitpK4LDup7H0JRmNjM1K5MuR1gNLUKjCFzwOgCYJDcAi4Kh0tv+HAzuP0XFw4XhNTz4aJ+5hA4xi8niIKOg9WnJxH6SEMmaikKAqXmbYIwqOZ1yrBqbcCq//NgdWUHYyiCVdVUoOPTwFrQsmOwAqUFXPUGjGURhZt1854WRJHFzQoXE2lA1arj+xXkNWAakgrN3Ufn9aGrLahDPq6O6hhwLUuA6LBH7IvS7p5MhwXYSwuy+6rM0PdUNoxUItXlJpObpqB1UJPJYE9lAGqtp4PXUY+Nn3HiLNngV3JUsSfb8TqbHzx5b9gVDbSp7nBkveBMhSKnd7zYCYEp+faaNPv4QiYn4aPje6nh1X1UllVZ5wloEAZi9yzsvbl/1i0PVcdWgbdCyVR4+1TasE9DYJ+aTxUTr+2gYqja3xs677l2Mp10SWG0mP+XGiS5zL9+S9VEJm1BcvVkrzx/m1X9hv0XTDEulWc8h5YCuH4rF2Q/SkuCMFrZfqnsxY48m3wTU7CTTUQnmgfrOfZ6X5VXpk1aqMgZV5J9TEeHK9J9xwsW/JNhtF7aAWsSZjJKCa+8wE3NgsrlvDtpSRKRB55IG3lrzJgoyOlst9TUaxi51R8v2iLvO3/2SHO0zcw+r5iZVOoRKvhMY2zgXtWwgirIYCpf/FZ6Uxc7YZTSx6tk6TnPAY7Z63kBceZcB/W6JbwO1iu9TqXekx/aSV05rhevfXubV/c9UgDl/3irdRglduq8O6MkVwv63R0NSKXe3cB6mOaWTJwgM+asyj5C/7r0EjwhmqfiVxI6jpD8NoIBz6ONE/FonZ/f7BmY0XUQpgGchWkcbFaYAJjPWZxw5TlMKSccxQvecmAUF006gNxCXFRFcbEZjSkU/XENnKWH2od7WCjn4z3cP9iJOtwGE0Pm8f4epS/HGUs9SAhpBMc5rq0bKGAu9g8yvklxQsLnAj/+vcEbMQkpsGxOQgQsQ6D4NiiGwrvS7zNrZu0Lw5fIqwhw2cv49lr/u/24jbCu6pwesbvA+WSWjJTLcBEGtm/tpNcpN6CEOtXVrs5dSI041c9fhAVtWWqfqq4KDFFGtP0znQWr+e33YrggN/23yt2W3ZFx/rUbeKs8QQVqw0vl/n/MYIB0cKSJw03k4KqTJ3a0wDleLB5TtRxEK8I+ea+X6iLCTw25fOqqOxrdDXrd6WD48Jnsv5xZ2peLKuUVW0sraqaUr8rkSSjF5CITkE/lPPyY0Bs+TMfDuztrPOEAOkIQ35/Ec+14mbrh+6jUXn0qoJE+haG+FX0Kc+iT2f2X1CaopZHOqkrdvHBc10lvy5FdgrJ5JLqndyMceaS3NFz9TMiHTUN+PrCWQ36+ZtBeyGePjmhYLfmbWbUQtQZ89k7soRr2xVs0Mgcjt96dZ80mVq87sX7WsRokpdt2LFhzrGJ56RyOZfC0/xyO9eYlJb5E7r6XSnb+RG8q7pQ9pECt6ozI0M7mjLA5/8oHgIoz6idxxm4U2dtSBcZ49voqNGrLIvWtF7X6SNcP1ScX2Rt82KPRpQP86Zk7TMP4zvZhc+NvZm4Cup9HyvPTfYNnP/fDvnX3BSO0qnBEEgrSbwCeKkjzMyfrYXb/i2hSMNydTpN8ms/6s2eN6Az011Anks+oTvMTLG/XF/iRLkjmiRb4jRYUgBokxn+1fRtPtqvbjsjO54qmyorQtM3ma0HHcKtPKz4UB/j9NmNrNJwMpsPx4KcnEQ00dCQSvENdeWlt99I5hyfeCSZEj93bL6rIC2qSz8DddqfWH93vX1GT9TnGOTWZpyJKmhyNh/1Z70vapHJB7zZ5ytQbjj/VetU79wG3la+Hx/M2on3zrYDCj1/94X138NmWUQrmu48rn2IZpZ7a0CCHy6nWH01+KBw83Iy7k+l41pvOPp3bFCFrX5A7BT61ARYJjjUAdCqA+IWEFrOZ78jolFJPANXSmVBRzpbORM3TmXkuqZLOZAZ//vxSsQzaKpQ7VJCJaqjAM4LSeMHns4ECTgqKhsAFQRFPbb8AKMopg57+oaBnaMoFkVS/KpJ8JrjP7+DN80XO1qe7sCMayI5McuaZPdzNC0Gxa3q4SdLNxoxCMDZxUIPvmG2bVTKgAp5Ei9Y+6VaZFnbjAZkn0ix3wWk1zPTQK45py+WpntxpcN6j4S7JA6k/+zVG0nzjPOPk8dVLlo/h/C/yNjFP4SxZhQpFnjzo0tMdR7fyvRs8hOQaeIaUJ4OOTII0ILUBH+AT0NPhaNDjwPuke1lx9OI5+HG+ibP9rHFHfIinBbBUE0ly9XCNCunSOY+XKonSrkY7iKkcNp92w0F1GDk41ORDi/IO5mbwQ0sRjy4wtgDtIsh8cO+skA18EDLUGDLBCjvI/5XiDNurJFlWdkfl6gOnpJbO0ZnV5tvbewXApfdYK+BShtJ4ApCnnyuGAlo3lOa+fen9kxfz7ebZDV0UjlvfOtkYMgg5asNhyJ2VhqIz0SKZzgtBdnJaFQhFMr1+kloXnZgWyaBAKGxSdGC79pJplrNqqHbkMIsEFYZeX8thjC2urIfD41OlFrhYbeVAsGNBFyVAFdhCBhQ0+Rcl7qj5vpPqlflPqri4qrgaISZuplrCTTJP6adTz2LTU/dydrheQ/VT95kx1E/0C6UiJzDNPQ3rsPl/AkCjVjc1yTrff97McRSQcBZLnhMGVAPraOCkkcteey3YlKJCqT6XFk7HdAG512EbhsXv+Bt1++NOD3UMOCQF3fHvs8HUms7G3TvO5L7Iebd343KFqqgYfIIDtLQcRW53f8aWUbvdf9oh6/8=&lt;/diagram&gt;&lt;/mxfile&gt;"><defs><style type="text/css" id="ge-export-svg-flow-animation">.ge-export-svg-flow-animation {&#xa;animation: ge-export-svg-flow-animation 0.5s linear;&#xa;animation-iteration-count: infinite;&#xa;}&#xa;@keyframes ge-export-svg-flow-animation {&#xa;to {&#xa;stroke-dashoffset: -16;&#xa;}&#xa;}</style></defs><g><rect x="105" y="154" width="60" height="286" fill="#bac8d3" stroke="none" pointer-events="all"/><path d="M 105 154 L 105 154 M 105 161.05 L 112.05 154 M 105 168.1 L 119.1 154 M 105 175.15 L 126.15 154 M 105 182.2 L 133.2 154 M 105 189.25 L 140.25 154 M 105 196.3 L 147.3 154 M 105 203.35 L 154.35 154 M 105 210.4 L 161.4 154 M 105 217.45 L 165 157.45 M 105 224.5 L 165 164.5 M 105 231.55 L 165 171.55 M 105 238.6 L 165 178.6 M 105 245.65 L 165 185.65 M 105 252.7 L 165 192.7 M 105 259.75 L 165 199.75 M 105 266.8 L 165 206.8 M 105 273.85 L 165 213.85 M 105 280.9 L 165 220.9 M 105 287.95 L 165 227.95 M 105 295 L 165 235 M 105 302.05 L 165 242.05 M 105 309.1 L 165 249.1 M 105 316.15 L 165 256.15 M 105 323.2 L 165 263.2 M 105 330.25 L 165 270.25 M 105 337.3 L 165 277.3 M 105 344.35 L 165 284.35 M 105 351.4 L 165 291.4 M 105 358.45 L 165 298.45 M 105 365.5 L 165 305.5 M 105 372.55 L 165 312.55 M 105 379.6 L 165 319.6 M 105 386.65 L 165 326.65 M 105 393.7 L 165 333.7 M 105 400.75 L 165 340.75 M 105 407.8 L 165 347.8 M 105 414.85 L 165 354.85 M 105 421.9 L 165 361.9 M 105 428.95 L 165 368.95 M 105 436 L 165 376 M 108.05 440 L 165 383.05 M 115.1 440 L 165 390.1 M 122.15 440 L 165 397.15 M 129.2 440 L 165 404.2 M 136.25 440 L 165 411.25 M 143.3 440 L 165 418.3 M 150.35 440 L 165 425.35 M 157.4 440 L 165 432.4 M 164.45 440 L 165 439.45" fill="none" stroke="#dddddd" stroke-width="0.2" stroke-miterlimit="10" pointer-events="all"/><path d="M 105 154 L 165 154 L 165 440 L 105 440 L 105 154" fill="none" stroke="#23445d" stroke-miterlimit="10" pointer-events="all"/><rect x="100" y="200" width="70" height="30" fill="#bac8d3" stroke="#23445d" transform="rotate(-90,135,215)" pointer-events="all"/><g transform="translate(-0.5 -0.5)rotate(-90 135 215)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 1px; height: 1px; padding-top: 215px; margin-left: 135px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: nowrap;">SHARED</div></div></div></foreignObject><text x="135" y="219" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">SHARED</text></switch></g><rect x="100" y="355" width="70" height="30" fill="#bac8d3" stroke="#23445d" transform="rotate(-90,135,370)" pointer-events="all"/><g transform="translate(-0.5 -0.5)rotate(-90 135 370)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 1px; height: 1px; padding-top: 370px; margin-left: 135px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: nowrap;">CONFIG</div></div></div></foreignObject><text x="135" y="374" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">CONFIG</text></switch></g><rect x="180" y="154" width="545" height="60" fill="#cce5ff" stroke="none" pointer-events="all"/><path d="M 725 154 L 725 154 M 725 161.05 L 717.95 154 M 725 168.1 L 710.9 154 M 725 175.15 L 703.85 154 M 725 182.2 L 696.8 154 M 725 189.25 L 689.75 154 M 725 196.3 L 682.7 154 M 725 203.35 L 675.65 154 M 725 210.4 L 668.6 154 M 721.55 214 L 661.55 154 M 714.5 214 L 654.5 154 M 707.45 214 L 647.45 154 M 700.4 214 L 640.4 154 M 693.35 214 L 633.35 154 M 686.3 214 L 626.3 154 M 679.25 214 L 619.25 154 M 672.2 214 L 612.2 154 M 665.15 214 L 605.15 154 M 658.1 214 L 598.1 154 M 651.05 214 L 591.05 154 M 644 214 L 584 154 M 636.95 214 L 576.95 154 M 629.9 214 L 569.9 154 M 622.85 214 L 562.85 154 M 615.8 214 L 555.8 154 M 608.75 214 L 548.75 154 M 601.7 214 L 541.7 154 M 594.65 214 L 534.65 154 M 587.6 214 L 527.6 154 M 580.55 214 L 520.55 154 M 573.5 214 L 513.5 154 M 566.45 214 L 506.45 154 M 559.4 214 L 499.4 154 M 552.35 214 L 492.35 154 M 545.3 214 L 485.3 154 M 538.25 214 L 478.25 154 M 531.2 214 L 471.2 154 M 524.15 214 L 464.15 154 M 517.1 214 L 457.1 154 M 510.05 214 L 450.05 154 M 503 214 L 443 154 M 495.95 214 L 435.95 154 M 488.9 214 L 428.9 154 M 481.85 214 L 421.85 154 M 474.8 214 L 414.8 154 M 467.75 214 L 407.75 154 M 460.7 214 L 400.7 154 M 453.65 214 L 393.65 154 M 446.6 214 L 386.6 154 M 439.55 214 L 379.55 154 M 432.5 214 L 372.5 154 M 425.45 214 L 365.45 154 M 418.4 214 L 358.4 154 M 411.35 214 L 351.35 154 M 404.3 214 L 344.3 154 M 397.25 214 L 337.25 154 M 390.2 214 L 330.2 154 M 383.15 214 L 323.15 154 M 376.1 214 L 316.1 154 M 369.05 214 L 309.05 154 M 362 214 L 302 154 M 354.95 214 L 294.95 154 M 347.9 214 L 287.9 154 M 340.85 214 L 280.85 154 M 333.8 214 L 273.8 154 M 326.75 214 L 266.75 154 M 319.7 214 L 259.7 154 M 312.65 214 L 252.65 154 M 305.6 214 L 245.6 154 M 298.55 214 L 238.55 154 M 291.5 214 L 231.5 154 M 284.45 214 L 224.45 154 M 277.4 214 L 217.4 154 M 270.35 214 L 210.35 154 M 263.3 214 L 203.3 154 M 256.25 214 L 196.25 154 M 249.2 214 L 189.2 154 M 242.15 214 L 182.15 154 M 235.1 214 L 180 158.9 M 228.05 214 L 180 165.95 M 221 214 L 180 173 M 213.95 214 L 180 180.05 M 206.9 214 L 180 187.1 M 199.85 214 L 180 194.15 M 192.8 214 L 180 201.2 M 185.75 214 L 180 208.25" fill="none" stroke="#dddddd" stroke-width="0.2" stroke-miterlimit="10" pointer-events="all"/><path d="M 180 154 L 725 154 L 725 214 L 180 214 L 180 154" fill="none" stroke="#36393d" stroke-miterlimit="10" pointer-events="all"/><rect x="180" y="230" width="545" height="140" fill="#d0cee2" stroke="none" pointer-events="all"/><path d="M 725 230 L 725 230 M 725 237.05 L 717.95 230 M 725 244.1 L 710.9 230 M 725 251.15 L 703.85 230 M 725 258.2 L 696.8 230 M 725 265.25 L 689.75 230 M 725 272.3 L 682.7 230 M 725 279.35 L 675.65 230 M 725 286.4 L 668.6 230 M 725 293.45 L 661.55 230 M 725 300.5 L 654.5 230 M 725 307.55 L 647.45 230 M 725 314.6 L 640.4 230 M 725 321.65 L 633.35 230 M 725 328.7 L 626.3 230 M 725 335.75 L 619.25 230 M 725 342.8 L 612.2 230 M 725 349.85 L 605.15 230 M 725 356.9 L 598.1 230 M 725 363.95 L 591.05 230 M 724 370 L 584 230 M 716.95 370 L 576.95 230 M 709.9 370 L 569.9 230 M 702.85 370 L 562.85 230 M 695.8 370 L 555.8 230 M 688.75 370 L 548.75 230 M 681.7 370 L 541.7 230 M 674.65 370 L 534.65 230 M 667.6 370 L 527.6 230 M 660.55 370 L 520.55 230 M 653.5 370 L 513.5 230 M 646.45 370 L 506.45 230 M 639.4 370 L 499.4 230 M 632.35 370 L 492.35 230 M 625.3 370 L 485.3 230 M 618.25 370 L 478.25 230 M 611.2 370 L 471.2 230 M 604.15 370 L 464.15 230 M 597.1 370 L 457.1 230 M 590.05 370 L 450.05 230 M 583 370 L 443 230 M 575.95 370 L 435.95 230 M 568.9 370 L 428.9 230 M 561.85 370 L 421.85 230 M 554.8 370 L 414.8 230 M 547.75 370 L 407.75 230 M 540.7 370 L 400.7 230 M 533.65 370 L 393.65 230 M 526.6 370 L 386.6 230 M 519.55 370 L 379.55 230 M 512.5 370 L 372.5 230 M 505.45 370 L 365.45 230 M 498.4 370 L 358.4 230 M 491.35 370 L 351.35 230 M 484.3 370 L 344.3 230 M 477.25 370 L 337.25 230 M 470.2 370 L 330.2 230 M 463.15 370 L 323.15 230 M 456.1 370 L 316.1 230 M 449.05 370 L 309.05 230 M 442 370 L 302 230 M 434.95 370 L 294.95 230 M 427.9 370 L 287.9 230 M 420.85 370 L 280.85 230 M 413.8 370 L 273.8 230 M 406.75 370 L 266.75 230 M 399.7 370 L 259.7 230 M 392.65 370 L 252.65 230 M 385.6 370 L 245.6 230 M 378.55 370 L 238.55 230 M 371.5 370 L 231.5 230 M 364.45 370 L 224.45 230 M 357.4 370 L 217.4 230 M 350.35 370 L 210.35 230 M 343.3 370 L 203.3 230 M 336.25 370 L 196.25 230 M 329.2 370 L 189.2 230 M 322.15 370 L 182.15 230 M 315.1 370 L 180 234.9 M 308.05 370 L 180 241.95 M 301 370 L 180 249 M 293.95 370 L 180 256.05 M 286.9 370 L 180 263.1 M 279.85 370 L 180 270.15 M 272.8 370 L 180 277.2 M 265.75 370 L 180 284.25 M 258.7 370 L 180 291.3 M 251.65 370 L 180 298.35 M 244.6 370 L 180 305.4 M 237.55 370 L 180 312.45 M 230.5 370 L 180 319.5 M 223.45 370 L 180 326.55 M 216.4 370 L 180 333.6 M 209.35 370 L 180 340.65 M 202.3 370 L 180 347.7 M 195.25 370 L 180 354.75 M 188.2 370 L 180 361.8 M 181.15 370 L 180 368.85" fill="none" stroke="#dddddd" stroke-width="0.2" stroke-miterlimit="10" pointer-events="all"/><path d="M 180 230 L 725 230 L 725 370 L 180 370 L 180 230" fill="none" stroke="#56517e" stroke-miterlimit="10" pointer-events="all"/><rect x="613.53" y="30" width="52.94" height="45" fill="none" stroke="none" pointer-events="all"/><path d="M 631.05 71.66 L 632.89 68.58 L 647.18 68.58 L 649.02 71.66 L 644.25 71.66 L 644.25 72.2 C 644.25 72.76 643.71 73.37 643.12 73.37 L 636.79 73.37 C 636.18 73.37 635.71 72.77 635.71 72.23 L 635.71 71.66 Z M 643.81 48.19 C 643.8 46.15 642.11 44.49 640.01 44.49 C 637.92 44.49 636.23 46.15 636.23 48.19 C 636.23 50.24 637.92 51.9 640.01 51.9 C 641.02 51.9 641.98 51.51 642.7 50.82 C 643.41 50.12 643.81 49.18 643.81 48.19 Z M 635.77 60.89 L 644.26 60.89 C 644.26 56.77 643.01 52.19 640.01 52.19 C 637.17 52.19 635.77 56.32 635.77 60.89 Z M 622.44 42.25 L 657.48 42.25 L 657.48 62.92 L 622.44 62.92 Z M 637.16 33.88 L 642.81 33.88 L 642.81 32.91 L 637.16 32.91 Z M 643.97 33.86 C 643.97 35.99 642.21 37.72 640.03 37.72 C 638.98 37.72 637.98 37.31 637.24 36.59 C 636.5 35.86 636.08 34.88 636.08 33.86 C 636.08 32.84 636.5 31.85 637.24 31.13 C 637.98 30.41 638.98 30 640.03 30 C 642.21 30 643.97 31.73 643.97 33.86 Z M 634.09 38.63 L 635.32 34.77 L 635.69 34.77 C 636.13 37.11 637.93 38.36 639.98 38.36 C 642.14 38.36 643.88 37.05 644.36 34.77 L 644.68 34.77 L 645.98 38.63 Z M 621.95 39.54 C 620.72 39.54 619.71 40.52 619.71 41.73 L 619.71 63.4 C 619.71 64.1 620.04 64.72 620.56 65.12 C 620.38 65.21 620.23 65.32 620.1 65.44 L 620.09 65.44 L 613.53 71.46 L 613.53 72.91 C 613.53 73.56 613.83 74.1 614.27 74.46 C 614.71 74.82 615.27 75 615.82 75 L 664.22 75 C 665.44 75 666.47 74.1 666.47 73.01 L 666.47 71.41 L 660.28 65.68 L 660.26 65.66 C 660.02 65.48 659.74 65.28 659.46 65.13 C 659.98 64.73 660.31 64.1 660.31 63.4 L 660.31 41.73 C 660.31 40.52 659.3 39.54 658.07 39.54 Z M 621.95 40.24 L 658.07 40.24 C 658.92 40.24 659.59 40.9 659.59 41.73 L 659.59 63.4 C 659.59 64.23 658.92 64.9 658.07 64.9 L 621.95 64.9 C 621.1 64.9 620.43 64.23 620.43 63.4 L 620.43 41.73 C 620.43 40.9 621.1 40.24 621.95 40.24 Z M 621.46 65.6 L 621.95 65.6 L 658.07 65.6 L 658.6 65.6 C 658.82 65.6 659.38 65.89 659.81 66.22 L 665.75 71.71 L 665.75 73.01 C 665.75 73.64 665.07 74.3 664.22 74.3 L 615.82 74.3 C 615.43 74.3 615.03 74.16 614.73 73.92 C 614.44 73.68 614.25 73.35 614.25 72.91 L 614.25 71.76 L 620.57 65.97 C 620.78 65.78 621.15 65.6 621.46 65.6 Z" fill="#005073" stroke="none" pointer-events="all"/><rect x="600" y="0" width="80" height="30" fill="none" stroke="none" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe flex-start; justify-content: unsafe center; width: 78px; height: 1px; padding-top: 7px; margin-left: 601px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;"><span style="color: rgb(0, 0, 0); font-family: Helvetica; font-size: 12px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-indent: 0px; text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(251, 251, 251); text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial; float: none; display: inline !important;">API CLIENT</span></div></div></div></foreignObject><text x="640" y="19" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">API CLIENT</text></switch></g><path d="M 255 52.55 L 267.49 30 L 292.51 30 L 305 52.55 L 292.51 75 L 267.49 75 Z M 260.79 60.2 C 260.78 60.69 260.96 61.15 261.29 61.5 C 261.62 61.85 262.08 62.04 262.55 62.04 L 297.45 62.04 L 302.68 53.67 L 297.45 44.49 L 262.55 44.49 C 262.08 44.49 261.62 44.68 261.29 45.03 C 260.96 45.38 260.78 45.84 260.79 46.33 Z M 262.15 46.48 C 262.25 46.07 262.65 45.82 263.06 45.92 L 296.74 45.92 L 301.07 53.67 L 296.74 60.71 L 263.06 60.71 C 262.81 60.77 262.56 60.7 262.38 60.52 C 262.2 60.35 262.11 60.1 262.15 59.85 Z M 265.12 58.62 C 265.17 59.03 265.53 59.32 265.93 59.29 L 278.46 59.29 C 278.69 59.32 278.92 59.24 279.08 59.08 C 279.25 58.93 279.34 58.7 279.32 58.47 L 279.32 48.72 C 279.32 48.5 279.23 48.29 279.06 48.14 C 278.9 48 278.68 47.93 278.46 47.96 L 265.93 47.96 C 265.72 47.95 265.51 48.02 265.36 48.16 C 265.21 48.31 265.12 48.51 265.12 48.72 Z M 266.48 49.44 L 277.31 49.44 L 271.87 53.72 Z M 266.43 51.07 L 271.47 55.26 C 271.79 55.46 272.2 55.46 272.52 55.26 L 277.86 51.07 L 277.86 57.81 L 266.48 57.81 Z M 281.33 58.47 C 281.31 58.71 281.41 58.95 281.58 59.11 C 281.76 59.27 282.01 59.34 282.24 59.29 L 294.83 59.29 C 295.05 59.3 295.26 59.22 295.42 59.06 C 295.57 58.91 295.65 58.69 295.63 58.47 L 295.66 48.72 C 295.66 48.35 295.4 48.02 295.03 47.96 L 282.14 47.96 C 281.93 47.95 281.73 48.02 281.57 48.16 C 281.42 48.31 281.33 48.51 281.33 48.72 Z M 283.1 49.49 L 293.82 49.49 L 288.43 53.83 Z M 282.84 51.07 L 287.88 55.2 C 288.24 55.31 288.63 55.31 288.99 55.2 L 294.22 51.07 L 294.22 57.81 L 282.84 57.81 Z" fill="#00bef2" stroke="none" pointer-events="all"/><rect x="245" y="0" width="70" height="30" fill="none" stroke="none" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 1px; height: 1px; padding-top: 15px; margin-left: 280px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: nowrap;">QUEUE</div></div></div></foreignObject><text x="280" y="19" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">QUEUE</text></switch></g><path stroke-dasharray="8" class="ge-export-svg-flow-animation" d="M 280 75 L 280 122 L 320 122 L 320 162.63" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="stroke"/><path d="M 320 167.88 L 316.5 160.88 L 320 162.63 L 323.5 160.88 Z" fill="rgb(0, 0, 0)" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe flex-end; justify-content: unsafe flex-start; width: 1px; height: 1px; padding-top: 122px; margin-left: 300px;"><div data-drawio-colors="color: black; " style="box-sizing: border-box; font-size: 0px; text-align: left;"><div style="display: inline-block; font-size: 12px; font-family: Arial, Helvetica; color: black; line-height: 1.2; pointer-events: all; white-space: nowrap;"><div style="padding:2px;border:1px solid gray;background:yellow;border-radius:2px;">1.1</div></div></div></div></foreignObject><text x="300" y="122" fill="black" font-family="Arial,Helvetica" font-size="12px">1.1</text></switch></g><rect x="704.27" y="169" width="100" height="30" fill="#cce5ff" stroke="#36393d" transform="rotate(90,754.27,184)" pointer-events="all"/><g transform="translate(-0.5 -0.5)rotate(90 754.27 184)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 1px; height: 1px; padding-top: 184px; margin-left: 754px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: nowrap;">APPLICATION</div></div></div></foreignObject><text x="754" y="188" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">APPLICATION</text></switch></g><rect x="454.27" y="169" width="250" height="30" fill="#cce5ff" stroke="#36393d" stroke-dasharray="3 3" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 248px; height: 1px; padding-top: 184px; margin-left: 455px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">CONTROLLERS</div></div></div></foreignObject><text x="579" y="188" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">CONTROLLERS</text></switch></g><rect x="195" y="169" width="250" height="30" fill="#cce5ff" stroke="#36393d" stroke-dasharray="3 3" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 248px; height: 1px; padding-top: 184px; margin-left: 196px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">CONSUMERS</div></div></div></foreignObject><text x="320" y="188" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">CONSUMERS</text></switch></g><path stroke-dasharray="8" class="ge-export-svg-flow-animation" d="M 640 75 L 640 114.5 L 588.2 114.5 L 588.2 160.17" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="stroke"/><path d="M 588.2 165.42 L 584.7 158.42 L 588.2 160.17 L 591.7 158.42 Z" fill="rgb(0, 0, 0)" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe flex-end; justify-content: unsafe flex-start; width: 1px; height: 1px; padding-top: 115px; margin-left: 608px;"><div data-drawio-colors="color: black; " style="box-sizing: border-box; font-size: 0px; text-align: left;"><div style="display: inline-block; font-size: 12px; font-family: Arial, Helvetica; color: black; line-height: 1.2; pointer-events: all; white-space: nowrap;"><div style="padding:2px;border:1px solid gray;background:yellow;border-radius:2px;">1.2</div></div></div></div></foreignObject><text x="608" y="115" fill="black" font-family="Arial,Helvetica" font-size="12px">1.2</text></switch></g><rect x="295" y="285" width="250" height="30" fill="#d0cee2" stroke="#56517e" stroke-dasharray="3 3" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 248px; height: 1px; padding-top: 300px; margin-left: 296px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">USECASES</div></div></div></foreignObject><text x="420" y="304" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">USECASES</text></switch></g><path stroke-dasharray="8" class="ge-export-svg-flow-animation" d="M 320 199 L 320 240 L 412.2 240 L 412.17 277.67" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="stroke"/><path d="M 412.17 282.92 L 408.68 275.92 L 412.17 277.67 L 415.68 275.92 Z" fill="rgb(0, 0, 0)" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe flex-end; justify-content: unsafe flex-start; width: 1px; height: 1px; padding-top: 240px; margin-left: 368px;"><div data-drawio-colors="color: black; " style="box-sizing: border-box; font-size: 0px; text-align: left;"><div style="display: inline-block; font-size: 12px; font-family: Arial, Helvetica; color: black; line-height: 1.2; pointer-events: all; white-space: nowrap;"><div style="padding:2px;border:1px solid gray;background:yellow;border-radius:2px;">2.1</div></div></div></div></foreignObject><text x="368" y="240" fill="black" font-family="Arial,Helvetica" font-size="12px">2.1</text></switch></g><path stroke-dasharray="8" class="ge-export-svg-flow-animation" d="M 516.77 199 L 516.8 242 L 482.5 242 L 482.5 278.63" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="stroke"/><path d="M 482.5 283.88 L 479 276.88 L 482.5 278.63 L 486 276.88 Z" fill="rgb(0, 0, 0)" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe flex-end; justify-content: unsafe flex-start; width: 1px; height: 1px; padding-top: 242px; margin-left: 500px;"><div data-drawio-colors="color: black; " style="box-sizing: border-box; font-size: 0px; text-align: left;"><div style="display: inline-block; font-size: 12px; font-family: Arial, Helvetica; color: black; line-height: 1.2; pointer-events: all; white-space: nowrap;"><div style="padding:2px;border:1px solid gray;background:yellow;border-radius:2px;">2.2</div></div></div></div></foreignObject><text x="500" y="242" fill="black" font-family="Arial,Helvetica" font-size="12px">2.2</text></switch></g><rect x="584.27" y="240" width="120" height="30" fill="#d0cee2" stroke="#56517e" stroke-dasharray="3 3" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 118px; height: 1px; padding-top: 255px; margin-left: 585px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">MODELS</div></div></div></foreignObject><text x="644" y="259" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">MODELS</text></switch></g><rect x="584.27" y="285" width="120" height="30" fill="#d0cee2" stroke="#56517e" stroke-dasharray="3 3" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 118px; height: 1px; padding-top: 300px; margin-left: 585px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">ENUMS</div></div></div></foreignObject><text x="644" y="304" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">ENUMS</text></switch></g><rect x="584.27" y="325" width="120" height="30" fill="#d0cee2" stroke="#56517e" stroke-dasharray="3 3" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 118px; height: 1px; padding-top: 340px; margin-left: 585px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">EXCEPTIONS</div></div></div></foreignObject><text x="644" y="344" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">EXCEPTIONS</text></switch></g><rect x="180" y="390" width="545" height="50" fill="#fad7ac" stroke="none" pointer-events="all"/><path d="M 725 390 L 725 390 M 725 397.05 L 717.95 390 M 725 404.1 L 710.9 390 M 725 411.15 L 703.85 390 M 725 418.2 L 696.8 390 M 725 425.25 L 689.75 390 M 725 432.3 L 682.7 390 M 725 439.35 L 675.65 390 M 718.6 440 L 668.6 390 M 711.55 440 L 661.55 390 M 704.5 440 L 654.5 390 M 697.45 440 L 647.45 390 M 690.4 440 L 640.4 390 M 683.35 440 L 633.35 390 M 676.3 440 L 626.3 390 M 669.25 440 L 619.25 390 M 662.2 440 L 612.2 390 M 655.15 440 L 605.15 390 M 648.1 440 L 598.1 390 M 641.05 440 L 591.05 390 M 634 440 L 584 390 M 626.95 440 L 576.95 390 M 619.9 440 L 569.9 390 M 612.85 440 L 562.85 390 M 605.8 440 L 555.8 390 M 598.75 440 L 548.75 390 M 591.7 440 L 541.7 390 M 584.65 440 L 534.65 390 M 577.6 440 L 527.6 390 M 570.55 440 L 520.55 390 M 563.5 440 L 513.5 390 M 556.45 440 L 506.45 390 M 549.4 440 L 499.4 390 M 542.35 440 L 492.35 390 M 535.3 440 L 485.3 390 M 528.25 440 L 478.25 390 M 521.2 440 L 471.2 390 M 514.15 440 L 464.15 390 M 507.1 440 L 457.1 390 M 500.05 440 L 450.05 390 M 493 440 L 443 390 M 485.95 440 L 435.95 390 M 478.9 440 L 428.9 390 M 471.85 440 L 421.85 390 M 464.8 440 L 414.8 390 M 457.75 440 L 407.75 390 M 450.7 440 L 400.7 390 M 443.65 440 L 393.65 390 M 436.6 440 L 386.6 390 M 429.55 440 L 379.55 390 M 422.5 440 L 372.5 390 M 415.45 440 L 365.45 390 M 408.4 440 L 358.4 390 M 401.35 440 L 351.35 390 M 394.3 440 L 344.3 390 M 387.25 440 L 337.25 390 M 380.2 440 L 330.2 390 M 373.15 440 L 323.15 390 M 366.1 440 L 316.1 390 M 359.05 440 L 309.05 390 M 352 440 L 302 390 M 344.95 440 L 294.95 390 M 337.9 440 L 287.9 390 M 330.85 440 L 280.85 390 M 323.8 440 L 273.8 390 M 316.75 440 L 266.75 390 M 309.7 440 L 259.7 390 M 302.65 440 L 252.65 390 M 295.6 440 L 245.6 390 M 288.55 440 L 238.55 390 M 281.5 440 L 231.5 390 M 274.45 440 L 224.45 390 M 267.4 440 L 217.4 390 M 260.35 440 L 210.35 390 M 253.3 440 L 203.3 390 M 246.25 440 L 196.25 390 M 239.2 440 L 189.2 390 M 232.15 440 L 182.15 390 M 225.1 440 L 180 394.9 M 218.05 440 L 180 401.95 M 211 440 L 180 409 M 203.95 440 L 180 416.05 M 196.9 440 L 180 423.1 M 189.85 440 L 180 430.15 M 182.8 440 L 180 437.2" fill="none" stroke="#dddddd" stroke-width="0.2" stroke-miterlimit="10" pointer-events="all"/><path d="M 180 390 L 725 390 L 725 440 L 180 440 L 180 390" fill="none" stroke="#b46504" stroke-miterlimit="10" pointer-events="all"/><rect x="195" y="400" width="120" height="30" fill="#fad7ac" stroke="#b46504" stroke-dasharray="3 3" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 118px; height: 1px; padding-top: 415px; margin-left: 196px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">REPOSITORIES</div></div></div></foreignObject><text x="255" y="419" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">REPOSITORIES</text></switch></g><rect x="335" y="400" width="120" height="30" fill="#fad7ac" stroke="#b46504" stroke-dasharray="3 3" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 118px; height: 1px; padding-top: 415px; margin-left: 336px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">STORAGES</div></div></div></foreignObject><text x="395" y="419" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">STORAGES</text></switch></g><rect x="465" y="400" width="120" height="30" fill="#fad7ac" stroke="#b46504" stroke-dasharray="3 3" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 118px; height: 1px; padding-top: 415px; margin-left: 466px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">GATEWAYS</div></div></div></foreignObject><text x="525" y="419" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">GATEWAYS</text></switch></g><rect x="595" y="400" width="120" height="30" fill="#fad7ac" stroke="#b46504" stroke-dasharray="3 3" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 118px; height: 1px; padding-top: 415px; margin-left: 596px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">PRODUCES</div></div></div></foreignObject><text x="655" y="419" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">PRODUCES</text></switch></g><rect x="55" y="285" width="60" height="30" fill="#bac8d3" stroke="#23445d" transform="rotate(90,85,300)" pointer-events="all"/><g transform="translate(-0.5 -0.5)rotate(90 85 300)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 1px; height: 1px; padding-top: 300px; margin-left: 85px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: nowrap;">CORE</div></div></div></foreignObject><text x="85" y="304" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">CORE</text></switch></g><rect x="720" y="282" width="70" height="30" fill="#d0cee2" stroke="#56517e" transform="rotate(90,755,297)" pointer-events="all"/><g transform="translate(-0.5 -0.5)rotate(90 755 297)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 1px; height: 1px; padding-top: 297px; margin-left: 755px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: nowrap;">DOMAIN</div></div></div></foreignObject><text x="755" y="301" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">DOMAIN</text></switch></g><rect x="690" y="400" width="130" height="30" fill="#fad7ac" stroke="#b46504" transform="rotate(90,755,415)" pointer-events="all"/><g transform="translate(-0.5 -0.5)rotate(90 755 415)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 1px; height: 1px; padding-top: 415px; margin-left: 755px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: nowrap;">INFRASTRUCTURE</div></div></div></foreignObject><text x="755" y="419" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">INFRASTRUCTURE</text></switch></g><path stroke-dasharray="8" class="ge-export-svg-flow-animation" d="M 357.5 315 L 258.99 398.09" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="stroke"/><path d="M 254.97 401.48 L 258.07 394.29 L 258.99 398.09 L 262.58 399.64 Z" fill="rgb(0, 0, 0)" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe flex-end; justify-content: unsafe flex-start; width: 1px; height: 1px; padding-top: 359px; margin-left: 306px;"><div data-drawio-colors="color: black; " style="box-sizing: border-box; font-size: 0px; text-align: left;"><div style="display: inline-block; font-size: 12px; font-family: Arial, Helvetica; color: black; line-height: 1.2; pointer-events: all; white-space: nowrap;"><div style="padding:2px;border:1px solid gray;background:yellow;border-radius:2px;">3.1</div></div></div></div></foreignObject><text x="306" y="359" fill="black" font-family="Arial,Helvetica" font-size="12px">3.1</text></switch></g><path stroke-dasharray="8" class="ge-export-svg-flow-animation" d="M 416.17 315 L 395.76 394.83" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="stroke"/><path d="M 394.46 399.92 L 392.8 392.27 L 395.76 394.83 L 399.59 394 Z" fill="rgb(0, 0, 0)" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe flex-end; justify-content: unsafe flex-start; width: 1px; height: 1px; padding-top: 358px; margin-left: 405px;"><div data-drawio-colors="color: black; " style="box-sizing: border-box; font-size: 0px; text-align: left;"><div style="display: inline-block; font-size: 12px; font-family: Arial, Helvetica; color: black; line-height: 1.2; pointer-events: all; white-space: nowrap;"><div style="padding:2px;border:1px solid gray;background:yellow;border-radius:2px;">3.2</div></div></div></div></foreignObject><text x="405" y="358" fill="black" font-family="Arial,Helvetica" font-size="12px">3.2</text></switch></g><path stroke-dasharray="8" class="ge-export-svg-flow-animation" d="M 435.43 315 L 519.33 396.56" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="stroke"/><path d="M 523.09 400.22 L 515.63 397.85 L 519.33 396.56 L 520.51 392.83 Z" fill="rgb(0, 0, 0)" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe flex-end; justify-content: unsafe flex-start; width: 1px; height: 1px; padding-top: 358px; margin-left: 480px;"><div data-drawio-colors="color: black; " style="box-sizing: border-box; font-size: 0px; text-align: left;"><div style="display: inline-block; font-size: 12px; font-family: Arial, Helvetica; color: black; line-height: 1.2; pointer-events: all; white-space: nowrap;"><div style="padding:2px;border:1px solid gray;background:yellow;border-radius:2px;">3.4</div></div></div></div></foreignObject><text x="480" y="358" fill="black" font-family="Arial,Helvetica" font-size="12px">3.4</text></switch></g><path stroke-dasharray="8" class="ge-export-svg-flow-animation" d="M 482.5 315 L 645.21 398.1" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="stroke"/><path d="M 649.88 400.49 L 642.06 400.42 L 645.21 398.1 L 645.24 394.19 Z" fill="rgb(0, 0, 0)" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe flex-end; justify-content: unsafe flex-start; width: 1px; height: 1px; padding-top: 358px; margin-left: 567px;"><div data-drawio-colors="color: black; " style="box-sizing: border-box; font-size: 0px; text-align: left;"><div style="display: inline-block; font-size: 12px; font-family: Arial, Helvetica; color: black; line-height: 1.2; pointer-events: all; white-space: nowrap;"><div style="padding:2px;border:1px solid gray;background:yellow;border-radius:2px;">3.5</div></div></div></div></foreignObject><text x="567" y="358" fill="black" font-family="Arial,Helvetica" font-size="12px">3.5</text></switch></g><path d="M 230 550 C 230 541.72 241.19 535 255 535 C 261.63 535 267.99 536.58 272.68 539.39 C 277.37 542.21 280 546.02 280 550 L 280 589.25 C 280 597.53 268.81 604.25 255 604.25 C 241.19 604.25 230 597.53 230 589.25 Z" fill="rgb(255, 255, 255)" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="all"/><path d="M 280 550 C 280 558.28 268.81 565 255 565 C 241.19 565 230 558.28 230 550" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 48px; height: 1px; padding-top: 582px; margin-left: 231px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">DB</div></div></div></foreignObject><text x="255" y="586" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">DB</text></switch></g><path d="M 425 545.95 L 425 548.73 C 425 550.81 421.84 552.09 419.3 552.93 C 413.61 554.76 404.65 555.73 395.42 555.74 C 388.29 555.76 380.02 555.2 372.85 553.47 C 370.76 552.95 365.08 551.35 365 548.79 L 365 545.97 C 365.11 543.59 369.88 542.02 373.92 541.06 C 380.29 539.64 389.04 538.88 397 539.06 C 405.03 539.21 412.95 539.93 419.95 542.11 C 421.75 542.77 424.89 544.01 425 545.95 Z M 425 551.62 L 425 554.29 L 415.1 595.48 C 414.76 596.96 413.7 597.78 410.57 598.68 C 407.26 599.62 402.18 600.34 395.08 600.38 C 388 600.35 383.49 599.66 380.33 598.94 C 377.85 598.32 375.42 597.55 374.84 595.66 L 365 554.32 L 365 551.57 C 365.88 553.28 369.05 554.52 372.36 555.4 C 379.79 557.22 387.79 557.79 395.83 557.76 C 403.51 557.66 411.91 557.18 419.41 554.91 C 422.23 554.01 424.43 552.86 425 551.62 Z" fill="#e05243" stroke="none" pointer-events="all"/><path d="M 425 545.95 L 425 548.73 C 425 550.81 421.84 552.11 419.3 552.93 C 413.63 554.74 404.66 555.71 395.42 555.74 C 388.29 555.77 380.02 555.22 372.85 553.47 C 370.76 552.95 365.09 551.36 365 548.79 L 365 545.97 C 365.03 548.07 368.92 549.75 373.71 550.88 C 381.94 552.68 389.66 553.01 396.1 552.93 C 404.54 552.84 412.72 552.06 418.82 550.29 C 421.9 549.31 424.95 548.01 425 545.95 Z M 415.1 595.48 C 414.75 596.96 413.72 597.78 410.57 598.68 C 407.26 599.62 402.18 600.34 395.08 600.38 C 388 600.37 383.48 599.66 380.33 598.94 C 377.85 598.32 375.42 597.55 374.84 595.66 L 365 554.32 L 365 551.57 L 374.83 592.92 C 375.48 595.22 379.62 596.12 381.56 596.54 C 385.87 597.39 390.95 597.76 395.68 597.67 C 401.12 597.6 406.23 597.18 410.53 596 C 412.54 595.4 414.55 594.79 415.08 592.83 L 425 551.62 L 425 554.29 Z" fill-opacity="0.3" fill="#000000" stroke="none" pointer-events="all"/><rect x="365" y="538.88" width="0" height="0" fill="none" stroke="rgb(0, 0, 0)" pointer-events="all"/><path d="M 401 574.59 L 387.97 574.59 L 387.97 561.81 L 401 561.81 Z M 383.87 591.63 C 380.64 591.63 377.54 588.96 377.54 585.39 C 377.54 582.1 380.21 579.08 383.95 579.08 C 387.33 579.08 390.45 581.56 390.45 585.48 C 390.45 588.35 388.07 591.63 383.87 591.63 Z M 398.05 591.4 L 404.51 579.63 L 410.98 591.4 Z" fill="#ffffff" stroke="none" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe flex-start; justify-content: unsafe center; width: 1px; height: 1px; padding-top: 607px; margin-left: 395px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: nowrap;">STORAGE</div></div></div></foreignObject><text x="395" y="619" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">STORAGE</text></switch></g><rect x="628.03" y="540.38" width="65.5" height="58.5" fill="none" stroke="none" pointer-events="all"/><path d="M 629.53 552.78 L 629.53 542.27 C 629.44 541.31 630.36 540.47 631.6 540.38 L 654.41 540.38 C 655.41 540.59 656.1 541.29 656.09 542.09 L 656.09 552.84 L 648.13 552.89 L 648.13 546.58 L 637.49 546.58 L 637.49 552.78 Z M 657.17 556.02 C 658.16 556.14 658.87 556.84 658.77 557.62 L 658.77 572.79 C 658.75 573.5 658.07 574.09 657.17 574.2 L 629.84 574.2 C 628.87 574.11 628.15 573.48 628.15 572.73 L 628.08 557.68 C 628.03 556.88 628.81 556.2 629.84 556.14 Z M 655.87 558.27 L 631.75 558.27 L 643.77 565.47 Z M 655.87 560.8 L 644.92 567.36 C 644.05 567.96 642.73 567.96 641.86 567.36 L 630.83 560.8 L 630.83 571.9 L 655.87 571.9 Z M 645.38 579.46 L 645.38 585.66 L 632.29 585.66 C 631.11 585.19 630.11 584.5 629.38 583.65 L 629.38 577.33 L 637.42 577.33 L 637.34 579.58 Z M 648.44 577.33 L 656.09 577.33 L 656.09 587.84 L 662.91 587.84 L 652.42 598.88 L 641.93 587.84 L 648.44 587.84 Z M 658.77 579.58 L 685.57 579.58 L 685.57 575.62 C 685.27 574.22 683.73 573.18 681.89 573.14 L 669.87 573.14 C 670.25 570.37 670.2 567.58 669.72 564.82 C 669.26 561.91 667.86 559.13 665.66 556.73 C 663.86 555.02 661.48 553.73 658.77 553.01 L 658.77 547.17 C 662.96 547.74 666.85 549.19 670.03 551.36 C 673.15 553.56 675.43 556.38 676.61 559.51 C 677.64 562 678.31 564.57 678.6 567.18 L 683.35 567.3 C 688.54 567.71 692.72 570.76 693.53 574.74 L 693.53 583.89 C 692.61 584.66 691.52 585.3 690.31 585.78 L 658.77 585.78 Z" fill="#00bef2" stroke="none" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe flex-start; justify-content: unsafe center; width: 1px; height: 1px; padding-top: 606px; margin-left: 661px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: nowrap;">TOPIC</div></div></div></foreignObject><text x="661" y="618" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">TOPIC</text></switch></g><path stroke-dasharray="8" class="ge-export-svg-flow-animation" d="M 395 430 L 395 532.51" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="stroke"/><path d="M 395 537.76 L 391.5 530.76 L 395 532.51 L 398.5 530.76 Z" fill="rgb(0, 0, 0)" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe flex-end; justify-content: unsafe flex-start; width: 1px; height: 1px; padding-top: 484px; margin-left: 395px;"><div data-drawio-colors="color: black; " style="box-sizing: border-box; font-size: 0px; text-align: left;"><div style="display: inline-block; font-size: 12px; font-family: Arial, Helvetica; color: black; line-height: 1.2; pointer-events: all; white-space: nowrap;"><div style="padding:2px;border:1px solid gray;background:yellow;border-radius:2px;">4.2</div></div></div></div></foreignObject><text x="395" y="484" fill="black" font-family="Arial,Helvetica" font-size="12px">4.2</text></switch></g><path stroke-dasharray="8" class="ge-export-svg-flow-animation" d="M 525 430 L 525 532.51" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="stroke"/><path d="M 525 537.76 L 521.5 530.76 L 525 532.51 L 528.5 530.76 Z" fill="rgb(0, 0, 0)" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe flex-end; justify-content: unsafe flex-start; width: 1px; height: 1px; padding-top: 484px; margin-left: 525px;"><div data-drawio-colors="color: black; " style="box-sizing: border-box; font-size: 0px; text-align: left;"><div style="display: inline-block; font-size: 12px; font-family: Arial, Helvetica; color: black; line-height: 1.2; pointer-events: all; white-space: nowrap;"><div style="padding:2px;border:1px solid gray;background:yellow;border-radius:2px;">4.3</div></div></div></div></foreignObject><text x="525" y="484" fill="black" font-family="Arial,Helvetica" font-size="12px">4.3</text></switch></g><path stroke-dasharray="8" class="ge-export-svg-flow-animation" d="M 655 430 L 655 485.2 L 654.9 534.01" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="stroke"/><path d="M 654.89 539.26 L 651.4 532.25 L 654.9 534.01 L 658.4 532.27 Z" fill="rgb(0, 0, 0)" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe flex-end; justify-content: unsafe flex-start; width: 1px; height: 1px; padding-top: 485px; margin-left: 655px;"><div data-drawio-colors="color: black; " style="box-sizing: border-box; font-size: 0px; text-align: left;"><div style="display: inline-block; font-size: 12px; font-family: Arial, Helvetica; color: black; line-height: 1.2; pointer-events: all; white-space: nowrap;"><div style="padding:2px;border:1px solid gray;background:yellow;border-radius:2px;">4.4</div></div></div></div></foreignObject><text x="655" y="485" fill="black" font-family="Arial,Helvetica" font-size="12px">4.4</text></switch></g><path stroke-dasharray="8" class="ge-export-svg-flow-animation" d="M 255 430 L 255 528.63" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="stroke"/><path d="M 255 533.88 L 251.5 526.88 L 255 528.63 L 258.5 526.88 Z" fill="rgb(0, 0, 0)" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe flex-end; justify-content: unsafe flex-start; width: 1px; height: 1px; padding-top: 483px; margin-left: 255px;"><div data-drawio-colors="color: black; " style="box-sizing: border-box; font-size: 0px; text-align: left;"><div style="display: inline-block; font-size: 12px; font-family: Arial, Helvetica; color: black; line-height: 1.2; pointer-events: all; white-space: nowrap;"><div style="padding:2px;border:1px solid gray;background:yellow;border-radius:2px;">4.1</div></div></div></div></foreignObject><text x="255" y="483" fill="black" font-family="Arial,Helvetica" font-size="12px">4.1</text></switch></g><rect x="55" y="90" width="730" height="420" fill="none" stroke="rgb(0, 0, 0)" stroke-width="2" stroke-dasharray="6 6" pointer-events="all"/><path d="M 524.73 538.92 C 524.07 538.96 523.42 539.13 522.84 539.41 L 497.06 551.71 C 495.7 552.37 494.72 553.6 494.39 555.04 L 488.01 582.71 C 487.73 583.99 487.97 585.34 488.67 586.46 C 488.79 586.58 488.88 586.7 488.96 586.87 L 506.8 609.03 C 507.75 610.18 509.19 610.88 510.67 610.88 L 539.29 610.88 C 540.77 610.88 542.21 610.18 543.15 609.03 L 561 586.83 C 561.9 585.67 562.27 584.15 561.95 582.71 L 555.57 555.04 C 555.24 553.6 554.26 552.37 552.9 551.71 L 527.12 539.41 C 526.38 539.04 525.56 538.88 524.73 538.92 Z" fill="#ffffff" stroke="none" pointer-events="all"/><path d="M 524.75 541.08 C 524.13 541.12 523.51 541.27 522.97 541.54 L 498.74 553.1 C 497.46 553.72 496.53 554.88 496.22 556.23 L 490.23 582.24 C 489.96 583.44 490.19 584.72 490.85 585.76 C 490.97 585.88 491.04 585.99 491.12 586.15 L 507.9 606.98 C 508.79 608.06 510.14 608.72 511.53 608.72 L 538.43 608.72 C 539.82 608.72 541.18 608.06 542.06 606.98 L 558.84 586.11 C 559.69 585.03 560.04 583.6 559.73 582.24 L 553.74 556.23 C 553.43 554.88 552.5 553.72 551.23 553.1 L 526.99 541.54 C 526.29 541.19 525.52 541.04 524.75 541.08 Z" fill="#2875e2" stroke="none" pointer-events="all"/><path d="M 525.02 553.82 C 524.43 553.8 507.9 561.93 507.68 562.35 C 507.16 563.35 503.4 580.7 503.62 581.08 C 503.75 581.3 506.46 584.73 509.64 588.71 L 515.43 595.95 L 524.95 595.95 L 534.48 595.96 L 540.54 588.39 L 546.6 580.82 L 544.48 571.52 L 542.16 562.04 C 536.5 559.18 530.79 556.44 525.02 553.82 Z M 526.04 562.32 C 526.84 562.36 526.92 563.57 528.63 563.7 C 530.87 563.86 530.63 561.78 532.34 563.23 C 534.05 564.68 531.96 564.79 532.49 566.96 C 533.02 569.14 534.93 568.27 534.08 570.35 C 533.23 572.42 532.48 570.46 530.57 571.64 C 528.66 572.82 530.08 574.36 527.84 574.2 C 525.61 574.03 527.24 572.71 525.53 571.26 C 523.81 569.81 522.79 571.64 522.25 569.46 C 521.72 567.28 523.48 568.43 524.33 566.35 C 525.18 564.28 523.12 563.86 525.03 562.68 C 525.27 562.54 525.47 562.44 525.64 562.38 C 525.79 562.33 525.92 562.31 526.04 562.32 Z M 528.27 564.77 C 527.94 564.77 527.62 564.82 527.31 564.91 C 525.59 565.43 524.62 567.24 525.14 568.96 C 525.66 570.68 527.47 571.64 529.18 571.12 C 530.9 570.6 531.87 568.79 531.35 567.08 C 530.94 565.72 529.69 564.78 528.27 564.77 Z M 515.44 570.36 C 515.66 570.36 515.87 570.4 516.08 570.47 C 518.13 571.1 516.04 572.19 517.51 573.76 C 518.97 575.33 520.21 573.33 520.69 575.42 C 521.17 577.52 519.18 576.25 518.55 578.31 C 517.92 580.37 520.27 580.43 518.7 581.89 C 517.13 583.36 517.23 581.01 515.14 581.49 C 513.04 581.97 514.16 584.04 512.11 583.41 C 510.05 582.78 512.14 581.7 510.68 580.12 C 509.21 578.54 507.98 580.55 507.5 578.45 C 507.02 576.35 509 577.63 509.63 575.57 C 510.26 573.51 507.91 573.45 509.48 571.98 C 511.05 570.52 510.95 572.87 513.04 572.39 C 514.88 571.97 514.25 570.33 515.44 570.35 Z M 530.73 572.61 C 530.93 572.61 531.17 572.66 531.46 572.77 C 533.83 573.69 530.71 575.11 532.55 576.87 C 534.39 578.63 535.67 575.44 536.7 577.77 C 537.73 580.1 534.51 578.89 534.57 581.44 C 534.62 583.99 537.78 582.64 536.86 585.01 C 535.94 587.38 534.52 584.26 532.76 586.1 C 531 587.94 534.18 589.21 531.86 590.24 C 529.53 591.26 530.74 588.05 528.19 588.11 C 525.65 588.16 527 591.32 524.62 590.4 C 522.25 589.48 525.37 588.06 523.53 586.3 C 521.69 584.54 520.42 587.73 519.39 585.4 C 518.37 583.07 521.58 584.27 521.52 581.73 C 521.47 579.19 518.31 580.54 519.23 578.16 C 520.15 575.79 521.57 578.92 523.33 577.08 C 525.09 575.24 521.9 573.96 524.23 572.93 C 526.56 571.9 525.35 575.12 527.9 575.06 C 530.12 575.01 529.37 572.59 530.73 572.6 Z M 514.1 573.7 C 512.3 573.7 510.85 575.15 510.85 576.94 C 510.85 578.74 512.3 580.19 514.1 580.19 C 515.89 580.19 517.34 578.74 517.34 576.94 C 517.34 575.15 515.89 573.7 514.1 573.7 Z M 528.05 576.81 C 525.41 576.81 523.27 578.95 523.27 581.59 C 523.27 584.23 525.41 586.37 528.05 586.37 C 530.69 586.37 532.83 584.23 532.83 581.58 C 532.83 578.94 530.69 576.8 528.05 576.8 Z" fill="#ffffff" stroke="none" pointer-events="all"/><rect x="0" y="105" width="170" height="30" fill="none" stroke="none" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 1px; height: 1px; padding-top: 120px; margin-left: 85px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: nowrap;">PADRÂO ARQUITETURAL</div></div></div></foreignObject><text x="85" y="124" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">PADRÂO ARQUITETURAL</text></switch></g></g><switch><g requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility"/><a transform="translate(0,-5)" xlink:href="https://www.drawio.com/doc/faq/svg-export-text-problems" target="_blank"><text text-anchor="middle" font-size="10px" x="50%" y="100%">Text is not SVG - cannot display</text></a></switch></svg>
```

## `docs/DER.drawio.svg`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!-- Do not edit this file with editors other than diagrams.net -->
<!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd">
<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" width="2339px" height="1251px" viewBox="-0.5 -0.5 2339 1251" content="&lt;mxfile host=&quot;drawio-plugin&quot; modified=&quot;2026-04-09T18:57:00.581Z&quot; agent=&quot;Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36&quot; etag=&quot;Zbu7ahj1mILt-2CGgQ53&quot; version=&quot;22.1.22&quot; type=&quot;embed&quot;&gt;&lt;diagram id=&quot;ODtRP6L8g8vsyoieFvmt&quot; name=&quot;Page-1&quot;&gt;7Z1vc9q4Foc/DZPdO7MZ/ze8hIS0mUvSLkna3fsm42AF3DWYsU2T7Ke/EraMjUSxwAiQNNPp2MJWbJ3jx8fSTzot82r6/in25pO7yAdhy9D895Z53TIM23Xh/6jgIyswXTsrGMeBnxXpq4KH4F+QF2p56SLwQVI5MI2iMA3m1cJRNJuBUVop8+I4eqse9hqF1b8698aAKHgYeSFZ+j3w00lW2jbcVflnEIwn+C/rTif7Zerhg/M7SSaeH72Visx+y7yKoyjNtqbvVyBEbYfbJTvvZsOvxYXFYJbWOcHITvjphYv83hYJiJP84tIPfMfwOudoM/VeUFEvSb04zQ1jarAANnXqBTMQwwJ9uR+G3jwJlodnJZMg9AfeR7RIcUV4r/cavAN/mNkFHQtNNICVoV1U+Sus/CG/GPSzFwbjGdwewbtEf7EXgwRey8BL0vyISToN802ySfJW+gniFLyXivIm+gSiKUjjD3gI/rWdnZG7q5sb721le7PjZGWTkt0Lf/VyfxsXNa9MAjdyq9AtZBIW+rVxhsidepMoDv5FJgnzJiwbbLn/FkxDbwb91PPXinrR8rlcNnwQhldRGCGrzqIZIAyLDvLjaP7oxWOQ5gXzKJily1u2e/AfbIQr7dJu2fBar+C+vtqH/9DhcXoVzZI0hg6E6gDQjm8A2bKXRvO80hC84vrjvInR9kuUptF0o6mN2qbGKKppW7MB01qEab/+d6Nx4V2lgRcOIc+82TjMTLHEm7cyBcVe1BYsWm29OdeftAi23Gu4JNQk8H0An7re2yRIwcPcG6GD3iDgtz1vZm0jlFtdY2v0vLJV+zDX5oUQJjMvhQ/AYuYnhCWL66xlXJswLvqlC4se+sPb7uDIhsYIzY7tJdCcwWw8yM501jzB5u8J75sfR4fxcdziGXWqa9Y1HIX0WkjXmkG6wxHpbn3T8nnOgR/g+hrjuVPbAgLxvE2NlGfeFGRU/9YdXn3uDn+ztd/h3v2XR/T/0wByXnu6v/3zqX/qwOfsGiIDvqMAzxPwHY6Ax590YhO+U9sEAhFe1wnTgqkXhFW+65rUgK/vGSIDXif7zRThD0h43eCJeIYut/NFvF7fCCIxnuxzm3tJ8hbF/vPESya/Br0EfGdwC6EBT3bfKcAfEvA2T8AzdMCdMeDt2kYQCfBkD1yQPHujNPiJrq335cug372HW9f9m+7TALH9cShJ7M7gEUKznezKU2w/JNvbPNnO0Pd2xmxv1zaCQGzHH4El245iAGv3n70066V5vL3rPzx2774+/q/C+Kun4bB///hc/C4H8Ou7icjAt0zC2sAfAzy6DVk5icbRzAv7q9JejP4ywCBfHTOIloZGDf4DpOlH/gLwFmlUNQe0QvzxV3nnb1TZpY13r98xIZZ7H8We30UatZVrwZKbIMSvHYqZ89uLFvEov79CFodfIq1ibAbd+i9dIQahtwyXypXvpXMhP7r/Q7XIwHsBYbUVCakX8uVg5IXd/IcpfDoygyENWOkZrb4yr6ktZ20SJBTawbzCVlmeR3tw/tAu246VB5/5i++PvKraDZrX/hVd+arqaqVm9fTo9TWBBt7zASG/dnXRDATtY9h7GqT4WD2ADQxy9GEeRz/gHSo1ZtWSNh7vy81RW7NXBKL7wKyIf9XXw06CzPrmPoIik6K2FVOSyfAVJ9IHBBmIYFHmYgG34C/Wka19HF0mgzuI/KFAEe0qtjP0DDGznac0k0V2e749Q4aUvf4U3S2pzJRzQJfBIYRGu+r054t2nqJMFsHtGaNdyk5/XHvJttHbDMTPOHJ/erq9/matgV0b9m/6w/79Vf8BBfdoTutvgf+7HMRXvf7L2skONUX8QxKfq0jTZOiGO1/km/WNIBLyyV44Lx5Ngp+bBnolgDqDJwgNdYYJlgrqTUCdpzDTZPhIO2Oou7WNIBLUyW80Jd5pyE1EJr5Fdtvm4+LPUzB9UYsVEV6AiZ0T3NZrErxA/V5aH/WC3md4vPD2kxwet8j3s5jD45aUr2iLfEVj1FKGyatdbFirdA69bAcZQmdwGZFf1w5Dv4zifwP85zmE7sgijyq8WCr+O6Q8Co2cbIf/2YyvHIT8DM4iMvnx14Mi/05dc+zk5znCbjMMpp1vz1zhwlJh3yZDtjhCDVsWTxlL7dSqT+7irn/X6w8vTp34vP1CaMKrtaj5Ep7riLpNRn8iIl7OxahJYfsP+GCosZf9vURk4Duk23Sv727vW4YTotZ/ieHWGG1l0QBZ/u22/x2Vr/kMbNS0dbBppGgudpK9XvTl6yaO/gFrXkdxRNINmMdeXNwbg8deKKPnbcrT7zTAb+weR5rlrl1artMqzXTXLzXDbW2b6w73voI4gHe7HI3LChuYAI9ftuUJ8HhElf8M+A75bXwiM+CdTUHJbjPg23rF//edAd/oDOsO+Q17IrPcmzMCtEHHOmEbtO2jQuoYS3Hg3E9lEmGJ9hFIdLJrcbQ3TVTahUSGbq49BcZ+TwF+wRuVWvFqmc1y6mRX42jORJBTluM2YhKnapFDrM2BH+GSRV4iL/aV9KhqVd3Q1pbmqKsebSRVmktGWb82kKz9UxvGseqv7X4E7ZFLRm9ijj279TubBeqhwi9WtTTH7u4gcleUq8Ye9hl7YGc716xpUgw9uFIOPbjk1wxNVHreilLe/iE06VV6TL6k56kjcqVIkOnWH+kXifTk7BD6IkwSrsLE4BFCs51hoR7F9gbYzlVBhEe2BYd7fSMIBPc22f02yixTpru7JhJtGSZ4AaNXTQ6dKINriEz5torgOVOe5yIdbSlC+LaUIXybDOFR9rR88aWM9bQUajfdwYMcOdQY/EJoxJPDNQrxB0U8zyRqbSkyIBc+LBfiybEWtQ5TQ24iNPE7hLX5ysv1TqEmz9SbmrZdv3koeXnuE2VNJ1acH0HTSb6MT0XTuek9t5OwGadv+ajY4CR0zR3yjXkqms3GTIAE/i4ODfAElxOygW4fV1xe0pP/XcERHU61OKNjPWuZNLppHws1xfWUHD31kn+ex7Ad50oPu6aH7azNByvUXFz0sDpLonupv9I22JshYfoRFLE6Jde9mJLYlSNL9ammUzLVK1Esq0OI/FGms6S7l5rwGyIudsLz1MUWo/cl894cm/CH6Ipb+bFcgKckfV5OLNsijc0mn0kjjGXxDqFpj+GuaM+L9jy1sTol+7SIrC+8WDLWkwMvSh67g0+ITXiVgZoz4bkqZHU5klDrcmah1ilpqOdREqRBNMswf3v/2P+E1kOTD/AqDXXWDioPNW/A8xTH6nKkotYZcgyLBHhcvdLHNuEZQoNepZ/mDnqeElldjgTUupwZqHVKCmqlkm3KUcTmPjkiz0GERjFIfhkVMRllKVI8Z/EIWjKTriVTKrItKjKnbkZXs4l1xXVTqcj2UpGZp60iM6VRkZlyqshMpSLb3yHEjlmUimyvb1V2wnNVkVmyqMgKP5YL8BbZ1ZTNyYCx/3yLlKw0eUMePRmDnwjNfVtF9py5z1VPZpORvZjct+UM7G0ysF92UkbxFuifTb5u7u4hNO4thiELhfsmcM9XXGaRgxZi8r5wZLl4b5EKYi9JIEIByICvaM/mHGLTXkmJedOeq9LMkkNKbMkpJbbIb7c0SFHblqeLGJom42wRBp8QGvGOCuh5I56rxsyRY0Jg4cZyId4hw3kfJKM4mK8mjDz2/3qUg+kMTiA201XYzpnpRm05VSNMlyNsd+QM2x3KDMA4gM9m+rEeuaPA/beLwZfvF+gpMbSLu/717dMd3vt8++nzhSRdNgzOIjb71eRA3uy3uLJfjsmBjpyTAynp59Xsb2aPEBrwlCT2CvCHBXzdFXcbATwli72IgC/cWDLAk91x/gI8+/APUKYEysB1BkcQmuuWCtw5c93UuI61yhG4W3IG7jYZuKtVPXb2DKFBb6sAnjfouU6GteUI4G05A3hbrepxOEcRmvt4vuaxUku1KpnvtuW9oxgyK6pkkcLTIppb+SM/FWf3wv6Cx1dxl0x7zVbZGiX5WSs7kRW11xbCcN21mrL7I2rqxrH3UTosfyPWvuJO/nc2XpjtWvud4OpbTlhfA2TtBLiR3eTuHk7PV3duHl5Z76ZN8XrraLnTDI3sJUgWL2rJG9qSN3bV3XW9rkijkcxphqZWRKgX59MNvnL1k1zzpvAR4de8WTmyVJE+5AVhYLXmDatDiBzRGzrDl77UhKeHWzsQnueaN4YuyVzYlR9LBnhSPL9cymb7ajfyTIVl8Q2hWU9Js6dYf1DW81znxsDWFLvTnuUzWiTSU7LiEdOk5J4Pu0MHi6CcJ4MCxfmDcp7rAjcGS3a8cwa9VdsMQoGenBkXJM+jaDoPQap0OKyuITTpcfWK9NxIz3NxG4Mle9IZk75wY7lIT8mdpGZKMXuE2IBXA7C8Ac9zaRuDsia9kICXc/iVsiK9Elo25ShCc98iMcBVhnZp206rIkXTtOKIDWK05d5XEAfwRpd6LDqTaQo1rK8tS9QKdh9cogZ34yhKy9aCvjq5i3yAjvg/&lt;/diagram&gt;&lt;/mxfile&gt;"><defs/><g><path d="M 0 30 L 0 0 L 396 0 L 396 30" fill="rgb(255, 255, 255)" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="all"/><path d="M 0 30 L 0 210 L 396 210 L 396 30" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="none"/><path d="M 0 30 L 396 30" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="none"/><path d="M 30 30 L 30 60 L 30 90 L 30 120 L 30 150 L 30 180 L 30 210" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="none"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 1px; height: 1px; padding-top: 15px; margin-left: 198px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; font-weight: bold; white-space: nowrap;">users</div></div></div></foreignObject><text x="198" y="19" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle" font-weight="bold">users</text></switch></g><path d="M 0 30 M 396 30 M 396 60 L 0 60" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="none"/><rect x="0" y="30" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 0 30 M 30 30 M 30 60 M 0 60" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 28px; height: 1px; padding-top: 45px; margin-left: 1px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; font-weight: bold; white-space: normal; overflow-wrap: normal;">PK</div></div></div></foreignObject><text x="15" y="49" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle" font-weight="bold">PK</text></switch></g><rect x="30" y="30" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 30 30 M 396 30 M 396 60 M 30 60" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 45px; margin-left: 38px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; font-weight: bold; text-decoration: underline; white-space: normal; overflow-wrap: normal;">id: SERIAL</div></div></div></foreignObject><text x="38" y="49" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" font-weight="bold" text-decoration="underline">id: SERIAL</text></switch></g><rect x="0" y="60" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 0 60 M 30 60 M 30 90 M 0 90" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="30" y="60" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 30 60 M 396 60 M 396 90 M 30 90" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 75px; margin-left: 38px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">username: VARCHAR(50) NOT NULL UNIQUE</div></div></div></foreignObject><text x="38" y="79" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">username: VARCHAR(50) NOT NULL UNIQUE</text></switch></g><rect x="0" y="90" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 0 90 M 30 90 M 30 120 M 0 120" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="30" y="90" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 30 90 M 396 90 M 396 120 M 30 120" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 105px; margin-left: 38px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">email: VARCHAR(100) NOT NULL UNIQUE</div></div></div></foreignObject><text x="38" y="109" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">email: VARCHAR(100) NOT NULL UNIQUE</text></switch></g><rect x="0" y="120" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 0 120 M 30 120 M 30 150 M 0 150" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="30" y="120" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 30 120 M 396 120 M 396 150 M 30 150" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 135px; margin-left: 38px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">password_hash VARCHAR(100) NOT NULL</div></div></div></foreignObject><text x="38" y="139" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">password_hash VARCHAR(100) NOT NULL</text></switch></g><rect x="0" y="150" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 0 150 M 30 150 M 30 180 M 0 180" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="30" y="150" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 30 150 M 396 150 M 396 180 M 30 180" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 165px; margin-left: 38px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">is_active BOOLEAN DEFAULT TRUE</div></div></div></foreignObject><text x="38" y="169" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">is_active BOOLEAN DEFAULT TRUE</text></switch></g><rect x="0" y="180" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 0 180 M 30 180 M 30 210 M 0 210" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="30" y="180" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 30 180 M 396 180 M 396 210 M 30 210" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 195px; margin-left: 38px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">created_at: TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP</div></div></div></foreignObject><text x="38" y="199" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">created_at: TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP</text></switch></g><path d="M 770 160 L 770 75 L 396 75" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="stroke"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 1px; height: 1px; padding-top: 133px; margin-left: 779px;"><div data-drawio-colors="color: rgb(0, 0, 0); background-color: rgb(255, 255, 255); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 11px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; background-color: rgb(255, 255, 255); white-space: nowrap;">*</div></div></div></foreignObject><text x="779" y="136" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="11px" text-anchor="middle">*</text></switch></g><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 1px; height: 1px; padding-top: 91px; margin-left: 437px;"><div data-drawio-colors="color: rgb(0, 0, 0); background-color: rgb(255, 255, 255); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 11px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; background-color: rgb(255, 255, 255); white-space: nowrap;">1</div></div></div></foreignObject><text x="437" y="94" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="11px" text-anchor="middle">1</text></switch></g><path d="M 572 190 L 572 160 L 968 160 L 968 190" fill="rgb(255, 255, 255)" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="all"/><path d="M 572 190 L 572 340 L 968 340 L 968 190" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="none"/><path d="M 572 190 L 968 190" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="none"/><path d="M 602 190 L 602 220 L 602 250 L 602 280 L 602 310 L 602 340" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="none"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 1px; height: 1px; padding-top: 175px; margin-left: 770px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; font-weight: bold; white-space: nowrap;">projects</div></div></div></foreignObject><text x="770" y="179" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle" font-weight="bold">projects</text></switch></g><path d="M 572 190 M 968 190 M 968 220 L 572 220" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="none"/><rect x="572" y="190" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 572 190 M 602 190 M 602 220 M 572 220" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 28px; height: 1px; padding-top: 205px; margin-left: 573px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; font-weight: bold; white-space: normal; overflow-wrap: normal;">PK</div></div></div></foreignObject><text x="587" y="209" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle" font-weight="bold">PK</text></switch></g><rect x="602" y="190" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 602 190 M 968 190 M 968 220 M 602 220" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 205px; margin-left: 610px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; font-weight: bold; text-decoration: underline; white-space: normal; overflow-wrap: normal;">id: uuid v4</div></div></div></foreignObject><text x="610" y="209" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" font-weight="bold" text-decoration="underline">id: uuid v4</text></switch></g><rect x="572" y="220" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 572 220 M 602 220 M 602 250 M 572 250" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="602" y="220" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 602 220 M 968 220 M 968 250 M 602 250" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 235px; margin-left: 610px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">name: VARCHAR(100) NOT NULL</div></div></div></foreignObject><text x="610" y="239" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">name: VARCHAR(100) NOT NULL</text></switch></g><rect x="572" y="250" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 572 250 M 602 250 M 602 280 M 572 280" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="602" y="250" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 602 250 M 968 250 M 968 280 M 602 280" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 265px; margin-left: 610px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">owner_id: UUIDV4 NOT NULL REFERENCES users(id)</div></div></div></foreignObject><text x="610" y="269" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">owner_id: UUIDV4 NOT NULL REFERENCES users(id)</text></switch></g><rect x="572" y="280" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 572 280 M 602 280 M 602 310 M 572 310" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="602" y="280" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 602 280 M 968 280 M 968 310 M 602 310" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 295px; margin-left: 610px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">archived_at: TIMESTAMPTZ</div></div></div></foreignObject><text x="610" y="299" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">archived_at: TIMESTAMPTZ</text></switch></g><rect x="572" y="310" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 572 310 M 602 310 M 602 340 M 572 340" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="602" y="310" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 602 310 M 968 310 M 968 340 M 602 340" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 325px; margin-left: 610px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">created_at: TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP</div></div></div></foreignObject><text x="610" y="329" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">created_at: TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP</text></switch></g><path d="M 332 470 L 332 440 L 728 440 L 728 470" fill="rgb(255, 255, 255)" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="all"/><path d="M 332 470 L 332 590 L 728 590 L 728 470" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="none"/><path d="M 332 470 L 728 470" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="none"/><path d="M 362 470 L 362 500 L 362 530 L 362 560 L 362 590" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="none"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 1px; height: 1px; padding-top: 455px; margin-left: 530px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; font-weight: bold; white-space: nowrap;">project_members</div></div></div></foreignObject><text x="530" y="459" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle" font-weight="bold">project_members</text></switch></g><path d="M 332 470 M 728 470 M 728 500 L 332 500" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="none"/><rect x="332" y="470" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 332 470 M 362 470 M 362 500 M 332 500" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 28px; height: 1px; padding-top: 485px; margin-left: 333px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; font-weight: bold; white-space: normal; overflow-wrap: normal;">PK</div></div></div></foreignObject><text x="347" y="489" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle" font-weight="bold">PK</text></switch></g><rect x="362" y="470" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 362 470 M 728 470 M 728 500 M 362 500" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 485px; margin-left: 370px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; font-weight: bold; text-decoration: underline; white-space: normal; overflow-wrap: normal;">project_id: uuid v4 REFERENCES projects(id)</div></div></div></foreignObject><text x="370" y="489" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" font-weight="bold" text-decoration="underline">project_id: uuid v4 REFERENCES projects(id)</text></switch></g><path d="M 332 500 M 728 500 M 728 530 L 332 530" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="none"/><rect x="332" y="500" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 332 500 M 362 500 M 362 530 M 332 530" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 28px; height: 1px; padding-top: 515px; margin-left: 333px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; font-weight: bold; white-space: normal; overflow-wrap: normal;">PK</div></div></div></foreignObject><text x="347" y="519" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle" font-weight="bold">PK</text></switch></g><rect x="362" y="500" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 362 500 M 728 500 M 728 530 M 362 530" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 515px; margin-left: 370px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; font-weight: bold; text-decoration: underline; white-space: normal; overflow-wrap: normal;">user_id: uuid v4 REFERENCES users(id)</div></div></div></foreignObject><text x="370" y="519" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" font-weight="bold" text-decoration="underline">user_id: uuid v4 REFERENCES users(id)</text></switch></g><rect x="332" y="530" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 332 530 M 362 530 M 362 560 M 332 560" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="362" y="530" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 362 530 M 728 530 M 728 560 M 362 560" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 545px; margin-left: 370px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">role: VARCHAR(20) DEFAULT 'MEMBER'</div></div></div></foreignObject><text x="370" y="549" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">role: VARCHAR(20) DEFAULT 'MEMBER'</text></switch></g><rect x="332" y="560" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 332 560 M 362 560 M 362 590 M 332 590" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="362" y="560" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 362 560 M 728 560 M 728 590 M 362 590" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 575px; margin-left: 370px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">joined_at: TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP</div></div></div></foreignObject><text x="370" y="579" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">joined_at: TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP</text></switch></g><rect x="742" y="480" width="80" height="60" fill="none" stroke="none" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 1px; height: 1px; padding-top: 510px; margin-left: 782px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: nowrap;">ADMIN<br />MEMBER<br />VIEWER</div></div></div></foreignObject><text x="782" y="514" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">ADMIN...</text></switch></g><path d="M 530 440 L 530 390 L 760.5 390 L 760.5 340.81" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="stroke"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 1px; height: 1px; padding-top: 419px; margin-left: 532px;"><div data-drawio-colors="color: rgb(0, 0, 0); background-color: rgb(255, 255, 255); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 11px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; background-color: rgb(255, 255, 255); white-space: nowrap;">*</div></div></div></foreignObject><text x="532" y="422" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="11px" text-anchor="middle">*</text></switch></g><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 1px; height: 1px; padding-top: 359px; margin-left: 762px;"><div data-drawio-colors="color: rgb(0, 0, 0); background-color: rgb(255, 255, 255); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 11px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; background-color: rgb(255, 255, 255); white-space: nowrap;">1</div></div></div></foreignObject><text x="762" y="362" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="11px" text-anchor="middle">1</text></switch></g><path d="M 1182 285 L 1075 285 L 1075 265 L 968 265" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="stroke"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 1px; height: 1px; padding-top: 296px; margin-left: 1163px;"><div data-drawio-colors="color: rgb(0, 0, 0); background-color: rgb(255, 255, 255); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 11px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; background-color: rgb(255, 255, 255); white-space: nowrap;">*</div></div></div></foreignObject><text x="1163" y="299" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="11px" text-anchor="middle">*</text></switch></g><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 1px; height: 1px; padding-top: 281px; margin-left: 993px;"><div data-drawio-colors="color: rgb(0, 0, 0); background-color: rgb(255, 255, 255); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 11px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; background-color: rgb(255, 255, 255); white-space: nowrap;">1</div></div></div></foreignObject><text x="993" y="284" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="11px" text-anchor="middle">1</text></switch></g><path d="M 1182 210 L 1182 180 L 1578 180 L 1578 210" fill="rgb(255, 255, 255)" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="all"/><path d="M 1182 210 L 1182 390 L 1578 390 L 1578 210" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="none"/><path d="M 1182 210 L 1578 210" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="none"/><path d="M 1212 210 L 1212 240 L 1212 270 L 1212 300 L 1212 330 L 1212 360 L 1212 390" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="none"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 1px; height: 1px; padding-top: 195px; margin-left: 1380px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; font-weight: bold; white-space: nowrap;">boards</div></div></div></foreignObject><text x="1380" y="199" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle" font-weight="bold">boards</text></switch></g><path d="M 1182 210 M 1578 210 M 1578 240 L 1182 240" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="none"/><rect x="1182" y="210" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1182 210 M 1212 210 M 1212 240 M 1182 240" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 28px; height: 1px; padding-top: 225px; margin-left: 1183px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; font-weight: bold; white-space: normal; overflow-wrap: normal;">PK</div></div></div></foreignObject><text x="1197" y="229" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle" font-weight="bold">PK</text></switch></g><rect x="1212" y="210" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1212 210 M 1578 210 M 1578 240 M 1212 240" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 225px; margin-left: 1220px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; font-weight: bold; text-decoration: underline; white-space: normal; overflow-wrap: normal;">id: uuid v4</div></div></div></foreignObject><text x="1220" y="229" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" font-weight="bold" text-decoration="underline">id: uuid v4</text></switch></g><rect x="1182" y="240" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1182 240 M 1212 240 M 1212 270 M 1182 270" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="1212" y="240" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1212 240 M 1578 240 M 1578 270 M 1212 270" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 255px; margin-left: 1220px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">project_id: uuidv4 REFERENCES projects(id)</div></div></div></foreignObject><text x="1220" y="259" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">project_id: uuidv4 REFERENCES projects(id)</text></switch></g><rect x="1182" y="270" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1182 270 M 1212 270 M 1212 300 M 1182 300" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="1212" y="270" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1212 270 M 1578 270 M 1578 300 M 1212 300" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 285px; margin-left: 1220px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">name: VARCHAR(100)) NOT NULL</div></div></div></foreignObject><text x="1220" y="289" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">name: VARCHAR(100)) NOT NULL</text></switch></g><rect x="1182" y="300" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1182 300 M 1212 300 M 1212 330 M 1182 330" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="1212" y="300" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1212 300 M 1578 300 M 1578 330 M 1212 330" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 315px; margin-left: 1220px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">color: VARCHAR(7) DEFAULT '#ebecf0'</div></div></div></foreignObject><text x="1220" y="319" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">color: VARCHAR(7) DEFAULT '#ebecf0'</text></switch></g><rect x="1182" y="330" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1182 330 M 1212 330 M 1212 360 M 1182 360" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="1212" y="330" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1212 330 M 1578 330 M 1578 360 M 1212 360" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 345px; margin-left: 1220px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">is_archived: BOOLEAN DEFAULT FALSE</div></div></div></foreignObject><text x="1220" y="349" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">is_archived: BOOLEAN DEFAULT FALSE</text></switch></g><rect x="1182" y="360" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1182 360 M 1212 360 M 1212 390 M 1182 390" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="1212" y="360" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1212 360 M 1578 360 M 1578 390 M 1212 390" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 375px; margin-left: 1220px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">created_at: TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP</div></div></div></foreignObject><text x="1220" y="379" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">created_at: TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP</text></switch></g><path d="M 198 210 L 198 325 L 410 325 L 410.01 440.75" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="stroke"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 1px; height: 1px; padding-top: 417px; margin-left: 413px;"><div data-drawio-colors="color: rgb(0, 0, 0); background-color: rgb(255, 255, 255); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 11px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; background-color: rgb(255, 255, 255); white-space: nowrap;">*</div></div></div></foreignObject><text x="413" y="421" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="11px" text-anchor="middle">*</text></switch></g><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 1px; height: 1px; padding-top: 238px; margin-left: 204px;"><div data-drawio-colors="color: rgb(0, 0, 0); background-color: rgb(255, 255, 255); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 11px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; background-color: rgb(255, 255, 255); white-space: nowrap;">1</div></div></div></foreignObject><text x="204" y="241" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="11px" text-anchor="middle">1</text></switch></g><path d="M 2140 410 L 2140 533.63" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="stroke"/><path d="M 2140 538.88 L 2136.5 531.88 L 2140 533.63 L 2143.5 531.88 Z" fill="rgb(0, 0, 0)" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="all"/><path d="M 1942 230 L 1942 200 L 2338 200 L 2338 230" fill="rgb(255, 255, 255)" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="all"/><path d="M 1942 230 L 1942 410 L 2338 410 L 2338 230" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="none"/><path d="M 1942 230 L 2338 230" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="none"/><path d="M 1972 230 L 1972 260 L 1972 290 L 1972 320 L 1972 350 L 1972 380 L 1972 410" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="none"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 1px; height: 1px; padding-top: 215px; margin-left: 2140px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; font-weight: bold; white-space: nowrap;">task_groups</div></div></div></foreignObject><text x="2140" y="219" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle" font-weight="bold">task_groups</text></switch></g><path d="M 1942 230 M 2338 230 M 2338 260 L 1942 260" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="none"/><rect x="1942" y="230" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1942 230 M 1972 230 M 1972 260 M 1942 260" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 28px; height: 1px; padding-top: 245px; margin-left: 1943px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; font-weight: bold; white-space: normal; overflow-wrap: normal;">PK</div></div></div></foreignObject><text x="1957" y="249" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle" font-weight="bold">PK</text></switch></g><rect x="1972" y="230" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1972 230 M 2338 230 M 2338 260 M 1972 260" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 245px; margin-left: 1980px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; font-weight: bold; text-decoration: underline; white-space: normal; overflow-wrap: normal;">id: uuid v4</div></div></div></foreignObject><text x="1980" y="249" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" font-weight="bold" text-decoration="underline">id: uuid v4</text></switch></g><rect x="1942" y="260" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1942 260 M 1972 260 M 1972 290 M 1942 290" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 28px; height: 1px; padding-top: 275px; margin-left: 1943px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">FK</div></div></div></foreignObject><text x="1957" y="279" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">FK</text></switch></g><rect x="1972" y="260" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1972 260 M 2338 260 M 2338 290 M 1972 290" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 275px; margin-left: 1980px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">board_id: uuidv4 REFERENCES boards(id)</div></div></div></foreignObject><text x="1980" y="279" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">board_id: uuidv4 REFERENCES boards(id)</text></switch></g><rect x="1942" y="290" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1942 290 M 1972 290 M 1972 320 M 1942 320" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="1972" y="290" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1972 290 M 2338 290 M 2338 320 M 1972 320" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 305px; margin-left: 1980px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">name: VARCHAR(100)) NOT NULL</div></div></div></foreignObject><text x="1980" y="309" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">name: VARCHAR(100)) NOT NULL</text></switch></g><rect x="1942" y="320" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1942 320 M 1972 320 M 1972 350 M 1942 350" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="1972" y="320" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1972 320 M 2338 320 M 2338 350 M 1972 350" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 335px; margin-left: 1980px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">position: INTEGER NOT NULL</div></div></div></foreignObject><text x="1980" y="339" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">position: INTEGER NOT NULL</text></switch></g><rect x="1942" y="350" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1942 350 M 1972 350 M 1972 380 M 1942 380" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="1972" y="350" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1972 350 M 2338 350 M 2338 380 M 1972 380" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 365px; margin-left: 1980px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">is_archived: BOOLEAN DEFAULT FALSE</div></div></div></foreignObject><text x="1980" y="369" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">is_archived: BOOLEAN DEFAULT FALSE</text></switch></g><rect x="1942" y="380" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1942 380 M 1972 380 M 1972 410 M 1942 410" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="1972" y="380" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1972 380 M 2338 380 M 2338 410 M 1972 410" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 395px; margin-left: 1980px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">created_at: TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP</div></div></div></foreignObject><text x="1980" y="399" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">created_at: TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP</text></switch></g><path d="M 1942 275 L 1760 275 L 1760 315 L 1584.37 315" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="stroke"/><path d="M 1579.12 315 L 1586.12 311.5 L 1584.37 315 L 1586.12 318.5 Z" fill="rgb(0, 0, 0)" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="all"/><path d="M 1942 570 L 1942 540 L 2338 540 L 2338 570" fill="rgb(255, 255, 255)" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="all"/><path d="M 1942 570 L 1942 900 L 2338 900 L 2338 570" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="none"/><path d="M 1942 570 L 2338 570" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="none"/><path d="M 1972 570 L 1972 600 L 1972 630 L 1972 660 L 1972 690 L 1972 720 L 1972 750 L 1972 780 L 1972 810 L 1972 840 L 1972 870 L 1972 900" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="none"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 1px; height: 1px; padding-top: 555px; margin-left: 2140px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; font-weight: bold; white-space: nowrap;">tasks</div></div></div></foreignObject><text x="2140" y="559" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle" font-weight="bold">tasks</text></switch></g><path d="M 1942 570 M 2338 570 M 2338 600 L 1942 600" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="none"/><rect x="1942" y="570" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1942 570 M 1972 570 M 1972 600 M 1942 600" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 28px; height: 1px; padding-top: 585px; margin-left: 1943px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; font-weight: bold; white-space: normal; overflow-wrap: normal;">PK</div></div></div></foreignObject><text x="1957" y="589" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle" font-weight="bold">PK</text></switch></g><rect x="1972" y="570" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1972 570 M 2338 570 M 2338 600 M 1972 600" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 585px; margin-left: 1980px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; font-weight: bold; text-decoration: underline; white-space: normal; overflow-wrap: normal;">id: uuid v4</div></div></div></foreignObject><text x="1980" y="589" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" font-weight="bold" text-decoration="underline">id: uuid v4</text></switch></g><rect x="1942" y="600" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1942 600 M 1972 600 M 1972 630 M 1942 630" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 28px; height: 1px; padding-top: 615px; margin-left: 1943px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">FK</div></div></div></foreignObject><text x="1957" y="619" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">FK</text></switch></g><rect x="1972" y="600" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1972 600 M 2338 600 M 2338 630 M 1972 630" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 615px; margin-left: 1980px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">task_gourp_id: uuidv4 REFERENCES task_groups(id)</div></div></div></foreignObject><text x="1980" y="619" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">task_gourp_id: uuidv4 REFERENCES task_groups(id)</text></switch></g><rect x="1942" y="630" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1942 630 M 1972 630 M 1972 660 M 1942 660" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 28px; height: 1px; padding-top: 645px; margin-left: 1943px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">FK</div></div></div></foreignObject><text x="1957" y="649" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">FK</text></switch></g><rect x="1972" y="630" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1972 630 M 2338 630 M 2338 660 M 1972 660" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 645px; margin-left: 1980px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">creator_id: uuidv4 REFERENCES users(id)</div></div></div></foreignObject><text x="1980" y="649" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">creator_id: uuidv4 REFERENCES users(id)</text></switch></g><rect x="1942" y="660" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1942 660 M 1972 660 M 1972 690 M 1942 690" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 28px; height: 1px; padding-top: 675px; margin-left: 1943px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">FK</div></div></div></foreignObject><text x="1957" y="679" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">FK</text></switch></g><rect x="1972" y="660" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1972 660 M 2338 660 M 2338 690 M 1972 690" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 675px; margin-left: 1980px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">assignee_id:uuidv4 REFERENCES users(id)</div></div></div></foreignObject><text x="1980" y="679" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">assignee_id:uuidv4 REFERENCES users(id)</text></switch></g><rect x="1942" y="690" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1942 690 M 1972 690 M 1972 720 M 1942 720" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="1972" y="690" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1972 690 M 2338 690 M 2338 720 M 1972 720" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 705px; margin-left: 1980px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">title: VARCHAR(200) NOT NULL</div></div></div></foreignObject><text x="1980" y="709" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">title: VARCHAR(200) NOT NULL</text></switch></g><rect x="1942" y="720" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1942 720 M 1972 720 M 1972 750 M 1942 750" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="1972" y="720" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1972 720 M 2338 720 M 2338 750 M 1972 750" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 735px; margin-left: 1980px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">description: TEXT</div></div></div></foreignObject><text x="1980" y="739" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">description: TEXT</text></switch></g><rect x="1942" y="750" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1942 750 M 1972 750 M 1972 780 M 1942 780" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="1972" y="750" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1972 750 M 2338 750 M 2338 780 M 1972 780" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 765px; margin-left: 1980px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">priority: VARCHAR(20) ('LOW', 'MEDIUM', 'HIGH')</div></div></div></foreignObject><text x="1980" y="769" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">priority: VARCHAR(20) ('LOW', 'MEDIUM', 'HIGH')</text></switch></g><rect x="1942" y="780" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1942 780 M 1972 780 M 1972 810 M 1942 810" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="1972" y="780" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1972 780 M 2338 780 M 2338 810 M 1972 810" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 795px; margin-left: 1980px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">position: INTEGER NOT NULL</div></div></div></foreignObject><text x="1980" y="799" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">position: INTEGER NOT NULL</text></switch></g><rect x="1942" y="810" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1942 810 M 1972 810 M 1972 840 M 1942 840" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="1972" y="810" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1972 810 M 2338 810 M 2338 840 M 1972 840" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 825px; margin-left: 1980px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">due_date: TIMESTAMPTZ</div></div></div></foreignObject><text x="1980" y="829" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">due_date: TIMESTAMPTZ</text></switch></g><rect x="1942" y="840" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1942 840 M 1972 840 M 1972 870 M 1942 870" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="1972" y="840" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1972 840 M 2338 840 M 2338 870 M 1972 870" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 855px; margin-left: 1980px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">is_archived: BOOLEAN DEFAULT FALSE</div></div></div></foreignObject><text x="1980" y="859" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">is_archived: BOOLEAN DEFAULT FALSE</text></switch></g><rect x="1942" y="870" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1942 870 M 1972 870 M 1972 900 M 1942 900" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="1972" y="870" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1972 870 M 2338 870 M 2338 900 M 1972 900" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 885px; margin-left: 1980px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">created_at: TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP</div></div></div></foreignObject><text x="1980" y="889" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">created_at: TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP</text></switch></g><path d="M 92 210 L 92 900 L 1556 900 L 1556 640 L 1942 640 L 1942 638.63" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="stroke"/><path d="M 1942 643.88 L 1938.5 636.88 L 1942 638.63 L 1945.5 636.88 Z" fill="rgb(0, 0, 0)" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="all"/><path d="M 396 195 L 1169 195 L 1169 705 L 1935.63 705" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="stroke"/><path d="M 1940.88 705 L 1933.88 708.5 L 1935.63 705 L 1933.88 701.5 Z" fill="rgb(0, 0, 0)" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="all"/><path d="M 1932 1070 L 1932 1040 L 2328 1040 L 2328 1070" fill="rgb(255, 255, 255)" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="all"/><path d="M 1932 1070 L 1932 1250 L 2328 1250 L 2328 1070" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="none"/><path d="M 1932 1070 L 2328 1070" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="none"/><path d="M 1962 1070 L 1962 1100 L 1962 1130 L 1962 1160 L 1962 1190 L 1962 1220 L 1962 1250" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="none"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 1px; height: 1px; padding-top: 1055px; margin-left: 2130px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; font-weight: bold; white-space: nowrap;">subtasks</div></div></div></foreignObject><text x="2130" y="1059" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle" font-weight="bold">subtasks</text></switch></g><path d="M 1932 1070 M 2328 1070 M 2328 1100 L 1932 1100" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="none"/><rect x="1932" y="1070" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1932 1070 M 1962 1070 M 1962 1100 M 1932 1100" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 28px; height: 1px; padding-top: 1085px; margin-left: 1933px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; font-weight: bold; white-space: normal; overflow-wrap: normal;">PK</div></div></div></foreignObject><text x="1947" y="1089" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle" font-weight="bold">PK</text></switch></g><rect x="1962" y="1070" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1962 1070 M 2328 1070 M 2328 1100 M 1962 1100" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 1085px; margin-left: 1970px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; font-weight: bold; text-decoration: underline; white-space: normal; overflow-wrap: normal;">id: uuid v4</div></div></div></foreignObject><text x="1970" y="1089" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" font-weight="bold" text-decoration="underline">id: uuid v4</text></switch></g><rect x="1932" y="1100" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1932 1100 M 1962 1100 M 1962 1130 M 1932 1130" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe center; width: 28px; height: 1px; padding-top: 1115px; margin-left: 1933px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: center; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">FK</div></div></div></foreignObject><text x="1947" y="1119" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px" text-anchor="middle">FK</text></switch></g><rect x="1962" y="1100" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1962 1100 M 2328 1100 M 2328 1130 M 1962 1130" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 1115px; margin-left: 1970px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">task_id: uuidv4 REFERENCES tasks(id)</div></div></div></foreignObject><text x="1970" y="1119" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">task_id: uuidv4 REFERENCES tasks(id)</text></switch></g><rect x="1932" y="1130" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1932 1130 M 1962 1130 M 1962 1160 M 1932 1160" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="1962" y="1130" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1962 1130 M 2328 1130 M 2328 1160 M 1962 1160" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 1145px; margin-left: 1970px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">description: VARCHAR(200) NOT NULL</div></div></div></foreignObject><text x="1970" y="1149" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">description: VARCHAR(200) NOT NULL</text></switch></g><rect x="1932" y="1160" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1932 1160 M 1962 1160 M 1962 1190 M 1932 1190" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="1962" y="1160" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1962 1160 M 2328 1160 M 2328 1190 M 1962 1190" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 1175px; margin-left: 1970px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">is_completed: BOOLEAN DEFAULT FALSE</div></div></div></foreignObject><text x="1970" y="1179" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">is_completed: BOOLEAN DEFAULT FALSE</text></switch></g><rect x="1932" y="1190" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1932 1190 M 1962 1190 M 1962 1220 M 1932 1220" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="1962" y="1190" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1962 1190 M 2328 1190 M 2328 1220 M 1962 1220" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 1205px; margin-left: 1970px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">position: INTEGER NOT NULL</div></div></div></foreignObject><text x="1970" y="1209" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">position: INTEGER NOT NULL</text></switch></g><rect x="1932" y="1220" width="30" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1932 1220 M 1962 1220 M 1962 1250 M 1932 1250" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><rect x="1962" y="1220" width="366" height="30" fill="none" stroke="none" pointer-events="all"/><path d="M 1962 1220 M 2328 1220 M 2328 1250 M 1962 1250" fill="none" stroke="rgb(0, 0, 0)" stroke-linecap="square" stroke-miterlimit="10" pointer-events="all"/><g transform="translate(-0.5 -0.5)"><switch><foreignObject pointer-events="none" width="100%" height="100%" requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" style="overflow: visible; text-align: left;"><div xmlns="http://www.w3.org/1999/xhtml" style="display: flex; align-items: unsafe center; justify-content: unsafe flex-start; width: 358px; height: 1px; padding-top: 1235px; margin-left: 1970px;"><div data-drawio-colors="color: rgb(0, 0, 0); " style="box-sizing: border-box; font-size: 0px; text-align: left; max-height: 26px; overflow: hidden;"><div style="display: inline-block; font-size: 12px; font-family: Helvetica; color: rgb(0, 0, 0); line-height: 1.2; pointer-events: all; white-space: normal; overflow-wrap: normal;">created_at: TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP</div></div></div></foreignObject><text x="1970" y="1239" fill="rgb(0, 0, 0)" font-family="Helvetica" font-size="12px">created_at: TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP</text></switch></g><path d="M 1942 885 L 1922 885 L 1922 970 L 2152.2 970 L 2152.18 1033.84" fill="none" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="stroke"/><path d="M 2152.18 1039.09 L 2148.68 1032.09 L 2152.18 1033.84 L 2155.68 1032.09 Z" fill="rgb(0, 0, 0)" stroke="rgb(0, 0, 0)" stroke-miterlimit="10" pointer-events="all"/></g><switch><g requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility"/><a transform="translate(0,-5)" xlink:href="https://www.drawio.com/doc/faq/svg-export-text-problems" target="_blank"><text text-anchor="middle" font-size="10px" x="50%" y="100%">Text is not SVG - cannot display</text></a></switch></svg>
```

## `estudo/EstudoAdicoesERemocoesApi.java`

```java
package estudo;

/**
 * ARQUIVO SÓ PARA ESTUDO — não faz parte da API e não é compilado.
 *
 * Adições: 929 linhas  (diff rastreado 308 + arquivos novos 621)
 * Remoções: 300 linhas
 *
 * Como ler:
 *  1) PARTE A = o que saiu (handlers antigos, filtros, JSON {error:...}, etc.)
 *  2) PARTE B = o que entrou no lugar (ApiException, JWT, exceções por equipe)
 *  3) PARTE C = arquivos .java / yaml / gradle novos por completo
 */
public final class EstudoAdicoesERemocoesApi {
    private EstudoAdicoesERemocoesApi() {}
}

// =============================================================================
// PARTE A — LINHAS REMOVIDAS (300)
// =============================================================================

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/Subtasks/application/controllers/SubtarefaController.java (2 linhas) -----
// -     public ResponseEntity<Void> criar(@RequestBody SubtarefaDTOinput input){
// -         return ResponseEntity.ok().build();

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/Subtasks/infra/repositories/SubtarefaRepository.java (4 linhas) -----
// -         jdbcTemplate.update(sql, novoTexto, id);
// -         jdbcTemplate.update(sql, novoStatus, id);
// -         jdbcTemplate.update(sql, novaPosicao, id);
// -         jdbcTemplate.update(sql, id);

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/Subtasks/model/SubtarefaDTOinput.java (1 linhas) -----
// - import java.time.OffsetDateTime;

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/ProjectExceptionHandler.java (63 linhas) -----
// - package br.edu.ifce.mn.ads.ifproject._commons;
// - 
// - import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.*;
// - import org.springframework.http.HttpStatus;
// - import org.springframework.http.ResponseEntity;
// - import org.springframework.web.bind.annotation.ExceptionHandler;
// - import org.springframework.web.bind.annotation.RestControllerAdvice;
// - 
// - import java.time.LocalDateTime;
// - import java.util.Map;
// - 
// - @RestControllerAdvice
// - public class ProjectExceptionHandler {
// - 
// -     @ExceptionHandler(ProjectNotFoundException.class)
// -     public ResponseEntity<Map<String, Object>> handle(ProjectNotFoundException ex) {
// -         return buildResponse(HttpStatus.NOT_FOUND, ex.getMessage());
// -     }
// - 
// -     @ExceptionHandler(MemberNotFoundException.class)
// -     public ResponseEntity<Map<String, Object>> handle(MemberNotFoundException ex) {
// -         return buildResponse(HttpStatus.NOT_FOUND, ex.getMessage());
// -     }
// - 
// -     @ExceptionHandler(ProjectAlreadyArchivedException.class)
// -     public ResponseEntity<Map<String, Object>> handle(ProjectAlreadyArchivedException ex) {
// -         return buildResponse(HttpStatus.CONFLICT, ex.getMessage());
// -     }
// - 
// -     @ExceptionHandler(ProjectNotArchivedException.class)
// -     public ResponseEntity<Map<String, Object>> handle(ProjectNotArchivedException ex) {
// -         return buildResponse(HttpStatus.CONFLICT, ex.getMessage());
// -     }
// - 
// -     @ExceptionHandler(MemberAlreadyExistsException.class)
// -     public ResponseEntity<Map<String, Object>> handle(MemberAlreadyExistsException ex) {
// -         return buildResponse(HttpStatus.CONFLICT, ex.getMessage());
// -     }
// - 
// -     @ExceptionHandler(CannotRemoveOwnerException.class)
// -     public ResponseEntity<Map<String, Object>> handle(CannotRemoveOwnerException ex) {
// -         return buildResponse(HttpStatus.UNPROCESSABLE_ENTITY, ex.getMessage());
// -     }
// - 
// -     @ExceptionHandler(CannotTransferToNonMemberException.class)
// -     public ResponseEntity<Map<String, Object>> handle(CannotTransferToNonMemberException ex) {
// -         return buildResponse(HttpStatus.UNPROCESSABLE_ENTITY, ex.getMessage());
// -     }
// - 
// -     @ExceptionHandler(InsufficientPermissionException.class)
// -     public ResponseEntity<Map<String, Object>> handle(InsufficientPermissionException ex) {
// -         return buildResponse(HttpStatus.FORBIDDEN, ex.getMessage());
// -     }
// - 
// -     private ResponseEntity<Map<String, Object>> buildResponse(HttpStatus status, String message) {
// -         return ResponseEntity.status(status).body(Map.of(
// -                 "status", status.value(),
// -                 "error", status.getReasonPhrase(),
// -                 "message", message,
// -                 "timestamp", LocalDateTime.now().toString()
// -         ));
// -     }
// - }

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/TenantFilter.java (27 linhas) -----
// - package br.edu.ifce.mn.ads.ifproject._commons;
// - 
// - import jakarta.servlet.FilterChain;
// - import jakarta.servlet.ServletException;
// - import jakarta.servlet.http.HttpServletRequest;
// - import jakarta.servlet.http.HttpServletResponse;
// - import org.jspecify.annotations.NonNull;
// - import org.springframework.stereotype.Component;
// - import org.springframework.web.filter.OncePerRequestFilter;
// - 
// - import java.io.IOException;
// - 
// - @Component
// - public class TenantFilter extends OncePerRequestFilter {
// - 
// -     @Override
// -     protected void doFilterInternal(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response, @NonNull FilterChain filterChain) {
// -         final var userId = request.getHeader("X-User-Id");
// -         ScopedValue.where(UserLogged.USER_ID, userId).run(() -> {
// -             try {
// -                 filterChain.doFilter(request, response);
// -             } catch (ServletException | IOException ex) {
// -                 throw new RuntimeException(ex);
// -             }
// -         });
// -     }
// - }

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/UserLogged.java (1 linhas) -----
// -             throw new RuntimeException("Usuário não autenticado");

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/UserLoggedFilter.java (44 linhas) -----
// - package br.edu.ifce.mn.ads.ifproject._commons;
// - 
// - import jakarta.servlet.FilterChain;
// - import jakarta.servlet.ServletException;
// - import jakarta.servlet.http.HttpServletRequest;
// - import jakarta.servlet.http.HttpServletResponse;
// - import org.springframework.stereotype.Component;
// - import org.springframework.web.filter.OncePerRequestFilter;
// - 
// - import java.io.IOException;
// - 
// - @Component
// - public class UserLoggedFilter extends OncePerRequestFilter {
// - 
// -     @Override
// -     protected void doFilterInternal(
// -             HttpServletRequest request,
// -             HttpServletResponse response,
// -             FilterChain filterChain
// -     ) throws ServletException, IOException {
// - 
// -         final var userId = request.getHeader("X-User-Id");
// - 
// -         if (userId != null && !userId.isBlank()) {
// -             try {
// -                 ScopedValue.where(UserLogged.USER_ID, userId)
// -                         .run(() -> {
// -                             try {
// -                                 filterChain.doFilter(request, response);
// -                             } catch (IOException | ServletException e) {
// -                                 throw new RuntimeException(e);
// -                             }
// -                         });
// -             } catch (RuntimeException e) {
// -                 Throwable cause = e.getCause();
// -                 if (cause instanceof IOException ioException) throw ioException;
// -                 if (cause instanceof ServletException servletException) throw servletException;
// -                 throw new ServletException(e);
// -             }
// -         } else {
// -             filterChain.doFilter(request, response);
// -         }
// -     }
// - }

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/boards/application/controllers/BoardController.java (8 linhas) -----
// - import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.archive.IArchiveBoard;
// -     public void delete(
// -             @PathVariable UUID id,
// -             @RequestHeader("X-User-Id") UUID requesterId
// -     ) {
// -         deleteBoard.execute(id, requesterId);
// -             @RequestHeader("X-User-Id") UUID requesterId,
// -                 requesterId

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/delete/DeleteBoard.java (5 linhas) -----
// -         boolean isAuthorized = repository.isUserAuthorizedToDelete(boardId, userId);
// - 
// -         if(!isAuthorized){
// -             throw new RuntimeException("User is not authorized to delete this board.");
// - 

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/duplicate/DuplicateBoard.java (1 linhas) -----
// - 

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/read/ReadBoard.java (4 linhas) -----
// - 
// -         final var board = repository.find(input);
// - 
// -         return board;

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/update/IUpdateBoard.java (1 linhas) -----
// -             @Size(min = 3, max = 30)

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/application/controllers/ProjectController.java (6 linhas) -----
// -     //@RequestHeader("X-User-Id") → Spring Security (futuro)
// -     //@RequestHeader("X-User-Id") → Spring Security (futuro)
// -     //@RequestHeader("X-User-Id") → Spring Security (futuro)
// -     public List<IListArchivedProjects.IListArchivedProjectsOutput> get(@RequestParam UUID userId, Pageable pageable) {
// -         var input = new IListArchivedProjects.ListArchivedProjectsInput(userId, pageable);
// -         return listArchivedProjects.execute(input, pageable);

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/CannotRemoveOwnerException.java (3 linhas) -----
// - public class CannotRemoveOwnerException extends RuntimeException {
// -     public CannotRemoveOwnerException() {
// -         super("Cannot remove the owner from the project", null, true, false);

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/CannotTransferToNonMemberException.java (3 linhas) -----
// - public class CannotTransferToNonMemberException extends RuntimeException {
// -         super("Cannot transfer ownership to a non-member: " + userId, null, true, false);
// - 

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/InsufficientPermissionException.java (4 linhas) -----
// - public class InsufficientPermissionException extends RuntimeException {
// -     public InsufficientPermissionException() {
// -         super("Insufficient permission to perform this action", null, false, false);
// - }

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/MemberAlreadyExistsException.java (3 linhas) -----
// - public class MemberAlreadyExistsException extends RuntimeException {
// -         super("Member " + userId + " already exists in project " + projectId, null, true, false);
// - 

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/MemberNotFoundException.java (3 linhas) -----
// - public class MemberNotFoundException extends RuntimeException {
// -         super("Member not found in project: " + userId, null, true, false);
// - 

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/ProjectAlreadyArchivedException.java (3 linhas) -----
// - public class ProjectAlreadyArchivedException extends RuntimeException {
// -         super("Project is already archived: " + id, null, true, false);
// - 

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/ProjectNotArchivedException.java (3 linhas) -----
// - public class ProjectNotArchivedException extends RuntimeException {
// -         super("Project is not archived: " + id, null, true, false);
// - 

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/ProjectNotFoundException.java (4 linhas) -----
// - public class ProjectNotFoundException extends RuntimeException {
// -         super("Project not found: " + id, null, true, false);
// - 
// - }

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/models/ProjectName.java (1 linhas) -----
// - @Size(min = 3, max = 100)

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/queries/list_archived_projects/IListArchivedProjects.java (1 linhas) -----
// -     List<IListArchivedProjectsOutput> execute(ListArchivedProjectsInput input, Pageable pageable);

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/queries/list_archived_projects/ListArchivedProjects.java (1 linhas) -----
// -     public List<IListArchivedProjectsOutput> execute(ListArchivedProjectsInput input, Pageable pageable) {

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/application/exceptions/GlobalExceptionHandler.java (64 linhas) -----
// - package br.edu.ifce.mn.ads.ifproject.subtasks.application.exceptions;
// - 
// - import br.edu.ifce.mn.ads.ifproject.subtasks.domain.exceptions.BusinessRuleException;
// - import br.edu.ifce.mn.ads.ifproject.subtasks.domain.exceptions.ResourceNotFoundException;
// - import org.springframework.http.HttpStatus;
// - import org.springframework.http.converter.HttpMessageNotReadableException;
// - import org.springframework.validation.FieldError;
// - import org.springframework.web.bind.MethodArgumentNotValidException;
// - import org.springframework.web.bind.annotation.ExceptionHandler;
// - import org.springframework.web.bind.annotation.ResponseStatus;
// - import org.springframework.web.bind.annotation.RestControllerAdvice;
// - import tools.jackson.databind.exc.InvalidFormatException;
// - 
// - import java.util.HashMap;
// - import java.util.List;
// - import java.util.Map;
// - 
// - @RestControllerAdvice
// - public class GlobalExceptionHandler {
// - 
// -     @ResponseStatus(HttpStatus.BAD_REQUEST)
// -     @ExceptionHandler(MethodArgumentNotValidException.class)
// -     public static Map<String, String> globalExceptions(MethodArgumentNotValidException ex) {
// -         Map<String, String> errors = new HashMap<>();
// - 
// -         ex.getBindingResult().getAllErrors().forEach((error) -> {
// -             String field = ((FieldError) error).getField();
// -             String errorMessage = error.getDefaultMessage();
// - 
// -             errors.put(field, errorMessage);
// -         });
// - 
// -         return errors;
// -     }
// - 
// -     @ResponseStatus(HttpStatus.NOT_FOUND)
// -     @ExceptionHandler(ResourceNotFoundException.class)
// -     public static Map<String, String> globalExceptions(ResourceNotFoundException ex) {
// -         return Map.of("error", ex.getMessage());
// -     }
// - 
// -     @ResponseStatus(HttpStatus.BAD_REQUEST)
// -     @ExceptionHandler(BusinessRuleException.class)
// -     public static Map<String, String> globalExceptions(BusinessRuleException ex) {
// -         return Map.of("error", ex.getMessage());
// -     }
// - 
// -     @ResponseStatus(HttpStatus.BAD_REQUEST)
// -     @ExceptionHandler(HttpMessageNotReadableException.class)
// -     public static Map<String, String> globalExceptions(HttpMessageNotReadableException ex) {
// - 
// -         Throwable cause = ex.getCause();
// - 
// -         if(cause instanceof InvalidFormatException invalidFormat){
// - 
// -             if(invalidFormat.getTargetType().isEnum() && invalidFormat.getPath().getFirst().getPropertyName().equals("priority")){
// -                 return Map.of("error", "Valor inválido para priority");
// -             }
// -         }
// - 
// -         return Map.of("error", "Valor inválido");
// - 
// -     }
// - }

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/domain/exceptions/BusinessRuleException.java (2 linhas) -----
// - public class BusinessRuleException extends RuntimeException {
// -         super(message);

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/domain/exceptions/ResourceNotFoundException.java (3 linhas) -----
// - public class ResourceNotFoundException extends RuntimeException {
// -         super(message);
// - 

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/domain/usecases/commands/toggle/ToggleSubtask.java (2 linhas) -----
// -         final var result = repository.toggle(id);
// -         return new ToggleSubtaskOutput(result.id(), result.isCompleted());

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/domain/usercases/commands/conversion/ConversionSubTasks.java (2 linhas) -----
// -                 .orElseThrow(() -> new ResourceNotFoundException("Subtask not found"));
// -             throw new BusinessRuleException("Subtask já está completada");

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/task/domain/usecase/activate/ActivateTask.java (1 linhas) -----
// -             throw new RuntimeException("Task not found");

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/task/domain/usecase/archived/ArchivedTask.java (1 linhas) -----
// -             throw new RuntimeException("Task not found");

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/task/domain/usecase/update/UpdateTask.java (1 linhas) -----
// -                 .orElseThrow(()->new RuntimeException("Task not found"));

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/archive/ArchiveTask.java (2 linhas) -----
// -         final var taskId = repository.persist(id);
// -         return null;

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/create/ICreateColumn.java (1 linhas) -----
// -     CreateColumnOutput execute(CreateColumnInput input);

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/delete/DeleteColumn.java (2 linhas) -----
// - import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.activate.IActivateUser;
// - import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/move/IMoveColumn.java (1 linhas) -----
// -     MoveColumnOutput execute(UUID id, MoveColumnInput input);

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/update/IRenameColumn.java (1 linhas) -----
// -     RenameColumnOutput execute(UUID id, RenameColumnInput input);

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/models/Password.java (1 linhas) -----
// - @Size(min = 4, max = 8)

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/models/Username.java (1 linhas) -----
// - @Size(min = 3, max = 10)

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/create/ICreateUser.java (1 linhas) -----
// -             @Email String email,

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/update/IUpdateUser.java (1 linhas) -----
// -             @Email String email

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/update_password/UpdateUserPassword.java (2 linhas) -----
// -         final var userId = repository.persist(id, input);
// -         return new UpdateUserPasswordOutput(userId);

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/infra/repositories/IUserRepository.java (1 linhas) -----
// -     Long persist(Long id, IUpdateUserPassword.UpdateUserPasswordInput input);

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/infra/repositories/UserRepository.java (4 linhas) -----
// -     public Long persist(Long id, IUpdateUserPassword.UpdateUserPasswordInput input) {
// -         db.sql(SQL)
// - 
// -         return id;

// ----- REMOVIDO em src/main/resources/application.yaml (2 linhas) -----
// -     url: jdbc:postgresql://localhost:5432/postgres
// -     password: postgres

// ----- REMOVIDO em src/main/resources/schema.sql (8 linhas) -----
// - CREATE TABLE users
// - CREATE TABLE projects
// - CREATE TABLE project_members
// - CREATE TABLE boards
// - CREATE TABLE task_groups
// - CREATE TABLE tasks
// - CREATE TABLE subtasks
// - );

// =============================================================================
// PARTE B — LINHAS ADICIONADAS EM ARQUIVOS JÁ EXISTENTES (308)
// =============================================================================

// ----- ADICIONADO em build.gradle (5 linhas) -----
// +     implementation 'org.springdoc:springdoc-openapi-starter-webmvc-ui:3.0.3'
// +     implementation 'org.springframework.boot:spring-boot-starter-security'
// +     implementation 'io.jsonwebtoken:jjwt-api:0.12.6'
// +     runtimeOnly 'io.jsonwebtoken:jjwt-impl:0.12.6'
// +     runtimeOnly 'io.jsonwebtoken:jjwt-jackson:0.12.6'

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/Subtasks/application/controllers/SubtarefaController.java (3 linhas) -----
// + import jakarta.validation.Valid;
// +     public ResponseEntity<Void> criar(@RequestBody @Valid SubtarefaDTOinput input){
// +         return ResponseEntity.ok(lista);

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/Subtasks/infra/repositories/SubtarefaRepository.java (13 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.subtasks.domain.exceptions.ResourceNotFoundException;
// +         if (jdbcTemplate.update(sql, novoTexto, id) == 0) {
// +             throw new ResourceNotFoundException("Subtarefa não encontrada");
// +         }
// +         if (jdbcTemplate.update(sql, novoStatus, id) == 0) {
// +             throw new ResourceNotFoundException("Subtarefa não encontrada");
// +         }
// +         if (jdbcTemplate.update(sql, novaPosicao, id) == 0) {
// +             throw new ResourceNotFoundException("Subtarefa não encontrada");
// +         }
// +         if (jdbcTemplate.update(sql, id) == 0) {
// +             throw new ResourceNotFoundException("Subtarefa não encontrada");
// +         }

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/Subtasks/model/SubtarefaDTOinput.java (20 linhas) -----
// + import jakarta.validation.constraints.NotBlank;
// + import jakarta.validation.constraints.NotNull;
// + 
// +     @NotNull(message = "A tarefa é obrigatória")
// +     @NotBlank(message = "O texto da subtarefa é obrigatório")
// +     public SubtarefaDTOinput() {
// +     }
// + 
// + 
// +     public void setTaskID(UUID taskID) {
// +         this.taskID = taskID;
// +     }
// + 
// +     public void setTexto(String texto) {
// +         this.texto = texto;
// +     }
// + 
// +     public void setPosicao(Integer posicao) {
// +         this.posicao = posicao;
// +     }

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/UserLogged.java (1 linhas) -----
// +             throw new UnauthenticatedException();

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/boards/application/controllers/BoardController.java (4 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
// +     public void delete(@PathVariable UUID id) {
// +         deleteBoard.execute(id, UserLogged.id());
// +                 UserLogged.id()

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/infra/repositories/BoardRepository.java (8 linhas) -----
// +     @Override
// +     public boolean exists(UUID id) {
// +         return db.sql("SELECT EXISTS(SELECT 1 FROM boards WHERE id = ?)")
// +                 .param(id)
// +                 .query(Boolean.class)
// +                 .single();
// +     }
// + 

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/infra/repositories/IBoardRepository.java (2 linhas) -----
// +     boolean exists(UUID id);
// + 

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/delete/DeleteBoard.java (7 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.boards.domain.exceptions.BoardNotFoundException;
// + import br.edu.ifce.mn.ads.ifproject.boards.domain.exceptions.BoardUnauthorizedException;
// +         if (!repository.exists(boardId)) {
// +             throw new BoardNotFoundException();
// +         }
// +         if (!repository.isUserAuthorizedToDelete(boardId, userId)) {
// +             throw new BoardUnauthorizedException();

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/duplicate/DuplicateBoard.java (4 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.boards.domain.exceptions.BoardNotFoundException;
// +         if (!repository.exists(input.originalBoardId())) {
// +             throw new BoardNotFoundException();
// +         }

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/read/ReadBoard.java (5 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.boards.domain.exceptions.BoardNotFoundException;
// +         if (!repository.exists(input.id())) {
// +             throw new BoardNotFoundException();
// +         }
// +         return repository.find(input);

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/update/IUpdateBoard.java (1 linhas) -----
// +             @Size(min = 3, max = 30, message = "O nome do quadro deve ter entre 3 e 30 caracteres")

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/update/UpdateBoard.java (4 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.boards.domain.exceptions.BoardNotFoundException;
// +         if (!repository.exists(id)) {
// +             throw new BoardNotFoundException();
// +         }

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/application/controllers/ProjectController.java (2 linhas) -----
// +     public List<IListArchivedProjects.IListArchivedProjectsOutput> getArchived(Pageable pageable) {
// +         return listArchivedProjects.execute(pageable);

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/CannotRemoveOwnerException.java (5 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + public class CannotRemoveOwnerException extends ApiException {
// +     public CannotRemoveOwnerException() {
// +         super(HttpStatus.UNPROCESSABLE_ENTITY, "Não é possível remover o dono do projeto");

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/CannotTransferToNonMemberException.java (5 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class CannotTransferToNonMemberException extends ApiException {
// +         super(HttpStatus.UNPROCESSABLE_ENTITY, "Só é possível transferir o projeto para um membro");

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/InsufficientPermissionException.java (6 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + public class InsufficientPermissionException extends ApiException {
// +     public InsufficientPermissionException() {
// +         super(HttpStatus.FORBIDDEN, "Você não tem permissão para realizar esta ação");
// + }

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/MemberAlreadyExistsException.java (5 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class MemberAlreadyExistsException extends ApiException {
// +         super(HttpStatus.CONFLICT, "Este membro já está no projeto");

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/MemberNotFoundException.java (5 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class MemberNotFoundException extends ApiException {
// +         super(HttpStatus.NOT_FOUND, "Membro não encontrado neste projeto");

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/ProjectAlreadyArchivedException.java (5 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class ProjectAlreadyArchivedException extends ApiException {
// +         super(HttpStatus.CONFLICT, "Este projeto já está arquivado");

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/ProjectNotArchivedException.java (5 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class ProjectNotArchivedException extends ApiException {
// +         super(HttpStatus.CONFLICT, "Este projeto não está arquivado");

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/ProjectNotFoundException.java (6 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class ProjectNotFoundException extends ApiException {
// +         super(HttpStatus.NOT_FOUND, "Projeto não encontrado");
// + }

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/models/ProjectName.java (1 linhas) -----
// + @Size(min = 3, max = 100, message = "O nome do projeto deve ter entre 3 e 100 caracteres")

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/queries/list_archived_projects/IListArchivedProjects.java (1 linhas) -----
// +     List<IListArchivedProjectsOutput> execute(Pageable pageable);

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/queries/list_archived_projects/ListArchivedProjects.java (3 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
// +     public List<IListArchivedProjectsOutput> execute(Pageable pageable) {
// +         var input = new ListArchivedProjectsInput(UserLogged.id(), pageable);

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/domain/exceptions/BusinessRuleException.java (5 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class BusinessRuleException extends ApiException {
// +         super(HttpStatus.UNPROCESSABLE_ENTITY, message);

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/domain/exceptions/ResourceNotFoundException.java (5 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class ResourceNotFoundException extends ApiException {
// +         super(HttpStatus.NOT_FOUND, message);

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/domain/usecases/commands/toggle/ToggleSubtask.java (8 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.subtasks.domain.exceptions.ResourceNotFoundException;
// + import org.springframework.dao.EmptyResultDataAccessException;
// +         try {
// +             final var result = repository.toggle(id);
// +             return new ToggleSubtaskOutput(result.id(), result.isCompleted());
// +         } catch (EmptyResultDataAccessException ex) {
// +             throw new ResourceNotFoundException("Subtarefa não encontrada");
// +         }

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/domain/usercases/commands/conversion/ConversionSubTasks.java (2 linhas) -----
// +                 .orElseThrow(() -> new ResourceNotFoundException("Subtarefa não encontrada"));
// +             throw new BusinessRuleException("Não é possível converter uma subtarefa já concluída");

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/task/domain/usecase/activate/ActivateTask.java (2 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.task.domain.exceptions.TaskNotFoundException;
// +             throw new TaskNotFoundException();

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/task/domain/usecase/archived/ArchivedTask.java (2 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.task.domain.exceptions.TaskNotFoundException;
// +             throw new TaskNotFoundException();

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/task/domain/usecase/update/UpdateTask.java (2 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.task.domain.exceptions.TaskNotFoundException;
// +                 .orElseThrow(TaskNotFoundException::new);

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/archive/ArchiveTask.java (6 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.task_groups.domain.exceptions.ColumnNotFoundException;
// +         if (!repository.exists(id)) {
// +             throw new ColumnNotFoundException();
// +         }
// +         repository.persist(id);
// +         return new ArchiveTaskOutput(id);

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/create/ICreateColumn.java (12 linhas) -----
// + import jakarta.validation.Valid;
// + import jakarta.validation.constraints.NotBlank;
// + import jakarta.validation.constraints.NotNull;
// + import jakarta.validation.constraints.Size;
// + import org.springframework.validation.annotation.Validated;
// + 
// + @Validated
// +     CreateColumnOutput execute(@Valid CreateColumnInput input);
// +             @NotBlank(message = "O nome da coluna é obrigatório")
// +             @Size(max = 50, message = "O nome da coluna deve ter até 50 caracteres")
// +             @NotNull(message = "A posição da coluna é obrigatória")
// +             @NotNull(message = "O quadro é obrigatório")

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/delete/DeleteColumn.java (4 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.task_groups.domain.exceptions.ColumnNotFoundException;
// +         if (!repository.exists(id)) {
// +             throw new ColumnNotFoundException();
// +         }

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/move/IMoveColumn.java (8 linhas) -----
// + import jakarta.validation.Valid;
// + import jakarta.validation.constraints.NotNull;
// + import org.springframework.validation.annotation.Validated;
// + 
// + @Validated
// +     MoveColumnOutput execute(UUID id, @Valid MoveColumnInput input);
// +             @NotNull(message = "A nova posição é obrigatória")
// +             @NotNull(message = "O quadro é obrigatório")

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/move/MoveColumn.java (4 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.task_groups.domain.exceptions.ColumnNotFoundException;
// +         if (!repository.exists(id)) {
// +             throw new ColumnNotFoundException();
// +         }

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/update/IRenameColumn.java (9 linhas) -----
// + import jakarta.validation.Valid;
// + import jakarta.validation.constraints.NotBlank;
// + import jakarta.validation.constraints.Size;
// + import org.springframework.validation.annotation.Validated;
// + 
// + @Validated
// +     RenameColumnOutput execute(UUID id, @Valid RenameColumnInput input);
// +             @NotBlank(message = "O nome da coluna é obrigatório")
// +             @Size(max = 50, message = "O nome da coluna deve ter até 50 caracteres")

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/update/RenameColumn.java (4 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.task_groups.domain.exceptions.ColumnNotFoundException;
// +         if (!repository.exists(id)) {
// +             throw new ColumnNotFoundException();
// +         }

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/infra/repositories/ITaskGroupRepository.java (2 linhas) -----
// +     boolean exists(UUID id);
// + 

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/infra/repositories/TaskGroupRepository.java (8 linhas) -----
// +     @Override
// +     public boolean exists(UUID id) {
// +         return db.sql("SELECT EXISTS(SELECT 1 FROM task_groups WHERE id = ?)")
// +                 .param(id)
// +                 .query(Boolean.class)
// +                 .single();
// +     }
// + 

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/application/controllers/UserController.java (9 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.authenticate.IAuthenticateUser;
// +     private final IAuthenticateUser authenticateUser;
// +             IAuthenticateUser authenticateUser,
// +         this.authenticateUser = authenticateUser;
// +     @PostMapping("login")
// +     public IAuthenticateUser.AuthenticateUserOutput login(@RequestBody IAuthenticateUser.AuthenticateUserInput input) {
// +         return authenticateUser.execute(input);
// +     }
// + 

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/models/Password.java (1 linhas) -----
// + @Size(min = 4, max = 8, message = "A senha deve ter entre 4 e 8 caracteres")

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/models/Username.java (1 linhas) -----
// + @Size(min = 3, max = 10, message = "O nome de usuário deve ter entre 3 e 10 caracteres")

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/activate/ActivateUser.java (4 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.users.domain.exceptions.UserNotFoundException;
// +         if (!repository.existsById(id)) {
// +             throw new UserNotFoundException();
// +         }

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/create/CreateUser.java (4 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.users.domain.exceptions.EmailAlreadyExistsException;
// +         if (repository.existsByEmail(input.email())) {
// +             throw new EmailAlreadyExistsException();
// +         }

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/create/ICreateUser.java (1 linhas) -----
// +             @Email(message = "Informe um e-mail válido") String email,

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/update/IUpdateUser.java (1 linhas) -----
// +             @Email(message = "Informe um e-mail válido") String email

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/update/UpdateUser.java (4 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.users.domain.exceptions.UserNotFoundException;
// +         if (!repository.existsById(id)) {
// +             throw new UserNotFoundException();
// +         }

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/update_password/UpdateUserPassword.java (10 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.users.domain.exceptions.InvalidCurrentPasswordException;
// + import br.edu.ifce.mn.ads.ifproject.users.domain.exceptions.UserNotFoundException;
// +         if (!repository.existsById(id)) {
// +             throw new UserNotFoundException();
// +         }
// +         final var updated = repository.updatePassword(id, input);
// +         if (updated == 0) {
// +             throw new InvalidCurrentPasswordException();
// +         }
// +         return new UpdateUserPasswordOutput(id);

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/infra/repositories/IUserRepository.java (9 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.authenticate.IAuthenticateUser;
// + import java.util.Optional;
// +     Optional<IAuthenticateUser.AuthenticatedUser> findByEmailAndPassword(String email, String password);
// + 
// +     int updatePassword(Long id, IUpdateUserPassword.UpdateUserPasswordInput input);
// + 
// +     boolean existsById(Long id);
// + 
// +     boolean existsByEmail(String email);

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/infra/repositories/UserRepository.java (37 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.authenticate.IAuthenticateUser;
// + import java.util.Optional;
// +     @Override
// +     public Optional<IAuthenticateUser.AuthenticatedUser> findByEmailAndPassword(String email, String password) {
// +         final var SQL = """
// +                 SELECT id, username, email
// +                 FROM users
// +                 WHERE lower(email) = lower(?)
// +                   AND password_hash = md5(?)
// +                   AND is_active = true
// +                 """;
// + 
// +         return db.sql(SQL)
// +                 .param(email)
// +                 .param(password)
// +                 .query(IAuthenticateUser.AuthenticatedUser.class)
// +                 .optional();
// +     }
// + 
// +     public int updatePassword(Long id, IUpdateUserPassword.UpdateUserPasswordInput input) {
// +         return db.sql(SQL)
// + 
// +     @Override
// +     public boolean existsById(Long id) {
// +         return db.sql("SELECT EXISTS(SELECT 1 FROM users WHERE id = ?)")
// +                 .param(id)
// +                 .query(Boolean.class)
// +                 .single();
// +     }
// + 
// +     @Override
// +     public boolean existsByEmail(String email) {
// +         return db.sql("SELECT EXISTS(SELECT 1 FROM users WHERE lower(email) = lower(?))")
// +                 .param(email)
// +                 .query(Boolean.class)
// +                 .single();
// +     }

// ----- ADICIONADO em src/main/resources/application.yaml (10 linhas) -----
// +     url: jdbc:postgresql://localhost:5432/if-project
// +     password: postgres
// +   sql:
// +     init:
// +       mode: always
// + 
// + app:
// +   jwt:
// +     secret: "if-project-dev-secret-key-change-me-32b+"
// +     expiration: 24h

// ----- ADICIONADO em src/main/resources/schema.sql (8 linhas) -----
// + CREATE TABLE IF NOT EXISTS users
// + CREATE TABLE IF NOT EXISTS projects
// + CREATE TABLE IF NOT EXISTS project_members
// + CREATE TABLE IF NOT EXISTS boards
// + CREATE TABLE IF NOT EXISTS task_groups
// + CREATE TABLE IF NOT EXISTS tasks
// + CREATE TABLE IF NOT EXISTS subtasks
// + );

// =============================================================================
// PARTE C — ARQUIVOS NOVOS (ainda não rastreados pelo git) (621 linhas)
// =============================================================================

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/UnauthenticatedException.java (11 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject._commons;
// + 
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class UnauthenticatedException extends ApiException {
// + 
// +     public UnauthenticatedException() {
// +         super(HttpStatus.UNAUTHORIZED, "Usuário não autenticado");
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/http/ApiErrorJson.java (35 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject._commons.http;
// + 
// + import jakarta.servlet.http.HttpServletResponse;
// + import org.springframework.http.HttpStatus;
// + import org.springframework.http.MediaType;
// + 
// + import java.io.IOException;
// + import java.time.Instant;
// + 
// + public final class ApiErrorJson {
// + 
// +     private ApiErrorJson() {
// +     }
// + 
// +     public static void write(HttpServletResponse response, HttpStatus status, String message) throws IOException {
// +         response.setStatus(status.value());
// +         response.setCharacterEncoding("UTF-8");
// +         response.setContentType(MediaType.APPLICATION_JSON_VALUE);
// +         response.getWriter().write("""
// +                 {"status":%d,"error":"%s","message":"%s","timestamp":"%s","fields":{}}
// +                 """.formatted(
// +                 status.value(),
// +                 escape(status.getReasonPhrase()),
// +                 escape(message),
// +                 Instant.now()
// +         ));
// +     }
// + 
// +     private static String escape(String value) {
// +         if (value == null) {
// +             return "";
// +         }
// +         return value.replace("\\", "\\\\").replace("\"", "\\\"");
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/http/ApiErrorResponse.java (28 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject._commons.http;
// + 
// + import org.springframework.http.HttpStatus;
// + 
// + import java.time.Instant;
// + import java.util.Map;
// + 
// + public record ApiErrorResponse(
// +         int status,
// +         String error,
// +         String message,
// +         String timestamp,
// +         Map<String, String> fields
// + ) {
// +     public static ApiErrorResponse of(HttpStatus status, String message) {
// +         return of(status, message, Map.of());
// +     }
// + 
// +     public static ApiErrorResponse of(HttpStatus status, String message, Map<String, String> fields) {
// +         return new ApiErrorResponse(
// +                 status.value(),
// +                 status.getReasonPhrase(),
// +                 message,
// +                 Instant.now().toString(),
// +                 fields == null ? Map.of() : fields
// +         );
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/http/ApiException.java (17 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject._commons.http;
// + 
// + import org.springframework.http.HttpStatus;
// + 
// + public class ApiException extends RuntimeException {
// + 
// +     private final HttpStatus status;
// + 
// +     public ApiException(HttpStatus status, String message) {
// +         super(message);
// +         this.status = status;
// +     }
// + 
// +     public HttpStatus status() {
// +         return status;
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/http/ApiExceptionHandler.java (148 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject._commons.http;
// + 
// + import jakarta.validation.ConstraintViolation;
// + import jakarta.validation.ConstraintViolationException;
// + import org.springframework.core.Ordered;
// + import org.springframework.core.annotation.Order;
// + import org.springframework.dao.DataIntegrityViolationException;
// + import org.springframework.dao.EmptyResultDataAccessException;
// + import org.springframework.http.HttpStatus;
// + import org.springframework.http.ResponseEntity;
// + import org.springframework.http.converter.HttpMessageNotReadableException;
// + import org.springframework.validation.FieldError;
// + import org.springframework.web.HttpRequestMethodNotSupportedException;
// + import org.springframework.web.bind.MethodArgumentNotValidException;
// + import org.springframework.web.bind.MissingServletRequestParameterException;
// + import org.springframework.web.bind.annotation.ExceptionHandler;
// + import org.springframework.web.bind.annotation.RestControllerAdvice;
// + import org.springframework.web.method.annotation.HandlerMethodValidationException;
// + import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
// + import org.springframework.web.servlet.resource.NoResourceFoundException;
// + import tools.jackson.databind.exc.InvalidFormatException;
// + 
// + import java.util.LinkedHashMap;
// + import java.util.Map;
// + 
// + @Order(Ordered.HIGHEST_PRECEDENCE)
// + @RestControllerAdvice
// + public class ApiExceptionHandler {
// + 
// +     @ExceptionHandler(ApiException.class)
// +     public ResponseEntity<ApiErrorResponse> handleApiException(ApiException ex) {
// +         return ResponseEntity.status(ex.status()).body(ApiErrorResponse.of(ex.status(), ex.getMessage()));
// +     }
// + 
// +     @ExceptionHandler(MethodArgumentNotValidException.class)
// +     public ResponseEntity<ApiErrorResponse> handleValidation(MethodArgumentNotValidException ex) {
// +         Map<String, String> fields = new LinkedHashMap<>();
// +         for (FieldError error : ex.getBindingResult().getFieldErrors()) {
// +             fields.put(error.getField(), messageOrDefault(error.getDefaultMessage()));
// +         }
// +         return badRequest("Dados inválidos", fields);
// +     }
// + 
// +     @ExceptionHandler(HandlerMethodValidationException.class)
// +     public ResponseEntity<ApiErrorResponse> handleMethodValidation(HandlerMethodValidationException ex) {
// +         Map<String, String> fields = new LinkedHashMap<>();
// +         ex.getAllErrors().forEach(error -> {
// +             if (error instanceof FieldError fieldError) {
// +                 fields.put(fieldError.getField(), messageOrDefault(fieldError.getDefaultMessage()));
// +             } else {
// +                 fields.put("request", messageOrDefault(error.getDefaultMessage()));
// +             }
// +         });
// +         return badRequest("Dados inválidos", fields);
// +     }
// + 
// +     @ExceptionHandler(ConstraintViolationException.class)
// +     public ResponseEntity<ApiErrorResponse> handleConstraint(ConstraintViolationException ex) {
// +         Map<String, String> fields = new LinkedHashMap<>();
// +         for (ConstraintViolation<?> violation : ex.getConstraintViolations()) {
// +             fields.put(fieldName(violation), messageOrDefault(violation.getMessage()));
// +         }
// +         return badRequest("Dados inválidos", fields);
// +     }
// + 
// +     @ExceptionHandler(HttpMessageNotReadableException.class)
// +     public ResponseEntity<ApiErrorResponse> handleUnreadable(HttpMessageNotReadableException ex) {
// +         Throwable cause = ex.getCause();
// +         if (cause instanceof InvalidFormatException invalidFormat && invalidFormat.getTargetType() != null) {
// +             String field = invalidFormat.getPath() == null || invalidFormat.getPath().isEmpty()
// +                     ? "request"
// +                     : invalidFormat.getPath().getFirst().getPropertyName();
// +             String message = invalidFormat.getTargetType().isEnum()
// +                     ? "Valor inválido para " + field
// +                     : "Formato inválido para " + field;
// +             return badRequest(message, Map.of(field, message));
// +         }
// +         return badRequest("JSON inválido. Verifique os campos enviados.", Map.of());
// +     }
// + 
// +     @ExceptionHandler(MissingServletRequestParameterException.class)
// +     public ResponseEntity<ApiErrorResponse> handleMissingParam(MissingServletRequestParameterException ex) {
// +         return badRequest(
// +                 "Parâmetro obrigatório ausente",
// +                 Map.of(ex.getParameterName(), "Este parâmetro é obrigatório")
// +         );
// +     }
// + 
// +     @ExceptionHandler(MethodArgumentTypeMismatchException.class)
// +     public ResponseEntity<ApiErrorResponse> handleTypeMismatch(MethodArgumentTypeMismatchException ex) {
// +         String name = ex.getName() == null ? "request" : ex.getName();
// +         return badRequest("Valor inválido", Map.of(name, "Formato inválido"));
// +     }
// + 
// +     @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
// +     public ResponseEntity<ApiErrorResponse> handleMethodNotAllowed(HttpRequestMethodNotSupportedException ex) {
// +         return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(ApiErrorResponse.of(
// +                 HttpStatus.METHOD_NOT_ALLOWED,
// +                 "Método HTTP não permitido"
// +         ));
// +     }
// + 
// +     @ExceptionHandler(NoResourceFoundException.class)
// +     public ResponseEntity<ApiErrorResponse> handleNotFound(NoResourceFoundException ex) {
// +         return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ApiErrorResponse.of(
// +                 HttpStatus.NOT_FOUND,
// +                 "Recurso não encontrado"
// +         ));
// +     }
// + 
// +     @ExceptionHandler(EmptyResultDataAccessException.class)
// +     public ResponseEntity<ApiErrorResponse> handleEmptyResult(EmptyResultDataAccessException ex) {
// +         return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ApiErrorResponse.of(
// +                 HttpStatus.NOT_FOUND,
// +                 "Recurso não encontrado"
// +         ));
// +     }
// + 
// +     @ExceptionHandler(DataIntegrityViolationException.class)
// +     public ResponseEntity<ApiErrorResponse> handleIntegrity(DataIntegrityViolationException ex) {
// +         return ResponseEntity.status(HttpStatus.CONFLICT).body(ApiErrorResponse.of(
// +                 HttpStatus.CONFLICT,
// +                 "Não foi possível salvar. Registro duplicado ou referência inválida."
// +         ));
// +     }
// + 
// +     @ExceptionHandler(Exception.class)
// +     public ResponseEntity<ApiErrorResponse> handleUnexpected(Exception ex) {
// +         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ApiErrorResponse.of(
// +                 HttpStatus.INTERNAL_SERVER_ERROR,
// +                 "Erro interno. Tente novamente."
// +         ));
// +     }
// + 
// +     private static ResponseEntity<ApiErrorResponse> badRequest(String message, Map<String, String> fields) {
// +         return ResponseEntity.badRequest().body(ApiErrorResponse.of(HttpStatus.BAD_REQUEST, message, fields));
// +     }
// + 
// +     private static String fieldName(ConstraintViolation<?> violation) {
// +         String path = violation.getPropertyPath().toString();
// +         int lastDot = path.lastIndexOf('.');
// +         return lastDot >= 0 ? path.substring(lastDot + 1) : path;
// +     }
// + 
// +     private static String messageOrDefault(String message) {
// +         return message == null || message.isBlank() ? "Valor inválido" : message;
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/security/JwtAuthenticationFilter.java (81 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject._commons.security;
// + 
// + import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiErrorJson;
// + import io.jsonwebtoken.JwtException;
// + import jakarta.servlet.FilterChain;
// + import jakarta.servlet.ServletException;
// + import jakarta.servlet.http.HttpServletRequest;
// + import jakarta.servlet.http.HttpServletResponse;
// + import org.springframework.http.HttpHeaders;
// + import org.springframework.http.HttpStatus;
// + import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
// + import org.springframework.security.core.context.SecurityContextHolder;
// + import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
// + import org.springframework.web.filter.OncePerRequestFilter;
// + 
// + import java.io.IOException;
// + import java.util.List;
// + import java.util.UUID;
// + 
// + public class JwtAuthenticationFilter extends OncePerRequestFilter {
// + 
// +     private final JwtService jwtService;
// + 
// +     public JwtAuthenticationFilter(JwtService jwtService) {
// +         this.jwtService = jwtService;
// +     }
// + 
// +     @Override
// +     protected void doFilterInternal(
// +             HttpServletRequest request,
// +             HttpServletResponse response,
// +             FilterChain filterChain
// +     ) throws ServletException, IOException {
// +         final var header = request.getHeader(HttpHeaders.AUTHORIZATION);
// +         if (header == null || !header.startsWith("Bearer ")) {
// +             filterChain.doFilter(request, response);
// +             return;
// +         }
// + 
// +         final UUID userId;
// +         try {
// +             userId = jwtService.parseUserId(header.substring("Bearer ".length()));
// +         } catch (JwtException | IllegalArgumentException ex) {
// +             writeUnauthorized(response, "Token inválido ou expirado");
// +             return;
// +         }
// + 
// +         final var authentication = new UsernamePasswordAuthenticationToken(userId, null, List.of());
// +         authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
// +         SecurityContextHolder.getContext().setAuthentication(authentication);
// + 
// +         try {
// +             ScopedValue.where(UserLogged.USER_ID, userId.toString()).run(() -> {
// +                 try {
// +                     filterChain.doFilter(request, response);
// +                 } catch (IOException | ServletException e) {
// +                     throw new FilterChainException(e);
// +                 }
// +             });
// +         } catch (FilterChainException e) {
// +             if (e.getCause() instanceof IOException ioException) {
// +                 throw ioException;
// +             }
// +             if (e.getCause() instanceof ServletException servletException) {
// +                 throw servletException;
// +             }
// +             throw new ServletException(e.getCause());
// +         }
// +     }
// + 
// +     private static void writeUnauthorized(HttpServletResponse response, String message) throws IOException {
// +         ApiErrorJson.write(response, HttpStatus.UNAUTHORIZED, message);
// +     }
// + 
// +     private static final class FilterChainException extends RuntimeException {
// +         private FilterChainException(Throwable cause) {
// +             super(cause);
// +         }
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/security/JwtProperties.java (12 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject._commons.security;
// + 
// + import org.springframework.boot.context.properties.ConfigurationProperties;
// + 
// + import java.time.Duration;
// + 
// + @ConfigurationProperties(prefix = "app.jwt")
// + public record JwtProperties(
// +         String secret,
// +         Duration expiration
// + ) {
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/security/JwtService.java (43 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject._commons.security;
// + 
// + import io.jsonwebtoken.Jwts;
// + import io.jsonwebtoken.security.Keys;
// + import org.springframework.stereotype.Component;
// + 
// + import javax.crypto.SecretKey;
// + import java.nio.charset.StandardCharsets;
// + import java.time.Instant;
// + import java.util.Date;
// + import java.util.UUID;
// + 
// + @Component
// + public class JwtService {
// + 
// +     private final JwtProperties properties;
// +     private final SecretKey key;
// + 
// +     public JwtService(JwtProperties properties) {
// +         this.properties = properties;
// +         this.key = Keys.hmacShaKeyFor(properties.secret().getBytes(StandardCharsets.UTF_8));
// +     }
// + 
// +     public String issue(UUID userId) {
// +         final var now = Instant.now();
// +         return Jwts.builder()
// +                 .subject(userId.toString())
// +                 .issuedAt(Date.from(now))
// +                 .expiration(Date.from(now.plus(properties.expiration())))
// +                 .signWith(key)
// +                 .compact();
// +     }
// + 
// +     public UUID parseUserId(String token) {
// +         final var subject = Jwts.parser()
// +                 .verifyWith(key)
// +                 .build()
// +                 .parseSignedClaims(token)
// +                 .getPayload()
// +                 .getSubject();
// +         return UUID.fromString(subject);
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/security/OpenApiConfig.java (23 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject._commons.security;
// + 
// + import io.swagger.v3.oas.models.Components;
// + import io.swagger.v3.oas.models.OpenAPI;
// + import io.swagger.v3.oas.models.security.SecurityRequirement;
// + import io.swagger.v3.oas.models.security.SecurityScheme;
// + import org.springframework.context.annotation.Bean;
// + import org.springframework.context.annotation.Configuration;
// + 
// + @Configuration
// + public class OpenApiConfig {
// + 
// +     @Bean
// +     OpenAPI openAPI() {
// +         final var schemeName = "bearer-jwt";
// +         return new OpenAPI()
// +                 .components(new Components().addSecuritySchemes(schemeName, new SecurityScheme()
// +                         .type(SecurityScheme.Type.HTTP)
// +                         .scheme("bearer")
// +                         .bearerFormat("JWT")))
// +                 .addSecurityItem(new SecurityRequirement().addList(schemeName));
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/security/SecurityConfig.java (78 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject._commons.security;
// + 
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiErrorJson;
// + import org.springframework.boot.context.properties.EnableConfigurationProperties;
// + import org.springframework.context.annotation.Bean;
// + import org.springframework.context.annotation.Configuration;
// + import org.springframework.http.HttpMethod;
// + import org.springframework.http.HttpStatus;
// + import org.springframework.security.config.Customizer;
// + import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// + import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// + import org.springframework.security.config.http.SessionCreationPolicy;
// + import org.springframework.security.web.SecurityFilterChain;
// + import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
// + import org.springframework.web.cors.CorsConfiguration;
// + import org.springframework.web.cors.CorsConfigurationSource;
// + import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
// + 
// + import java.util.List;
// + 
// + @Configuration
// + @EnableWebSecurity
// + @EnableConfigurationProperties(JwtProperties.class)
// + public class SecurityConfig {
// + 
// +     @Bean
// +     JwtAuthenticationFilter jwtAuthenticationFilter(JwtService jwtService) {
// +         return new JwtAuthenticationFilter(jwtService);
// +     }
// + 
// +     @Bean
// +     SecurityFilterChain securityFilterChain(HttpSecurity http, JwtAuthenticationFilter jwtAuthenticationFilter) throws Exception {
// +         return http
// +                 .csrf(csrf -> csrf.disable())
// +                 .cors(Customizer.withDefaults())
// +                 .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
// +                 .authorizeHttpRequests(auth -> auth
// +                         .requestMatchers(HttpMethod.OPTIONS, "/**").permitAll()
// +                         .requestMatchers(HttpMethod.POST, "/api/v1/users", "/api/v1/users/login").permitAll()
// +                         .requestMatchers(
// +                                 "/swagger-ui/**",
// +                                 "/swagger-ui.html",
// +                                 "/v3/api-docs/**",
// +                                 "/error"
// +                         ).permitAll()
// +                         .anyRequest().authenticated()
// +                 )
// +                 .exceptionHandling(handling -> handling
// +                         .authenticationEntryPoint((request, response, ex) ->
// +                                 ApiErrorJson.write(response, HttpStatus.UNAUTHORIZED, "Não autenticado")
// +                         )
// +                         .accessDeniedHandler((request, response, ex) ->
// +                                 ApiErrorJson.write(response, HttpStatus.FORBIDDEN, "Você não tem permissão para esta ação")
// +                         )
// +                 )
// +                 .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
// +                 .build();
// +     }
// + 
// +     @Bean
// +     CorsConfigurationSource corsConfigurationSource() {
// +         final var config = new CorsConfiguration();
// +         config.setAllowedOrigins(List.of(
// +                 "http://localhost:5173",
// +                 "http://localhost:3000",
// +                 "http://127.0.0.1:5173",
// +                 "http://127.0.0.1:3000"
// +         ));
// +         config.setAllowedMethods(List.of("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"));
// +         config.setAllowedHeaders(List.of("*"));
// +         config.setExposedHeaders(List.of("Authorization"));
// +         config.setAllowCredentials(true);
// + 
// +         final var source = new UrlBasedCorsConfigurationSource();
// +         source.registerCorsConfiguration("/**", config);
// +         return source;
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/exceptions/BoardNotFoundException.java (10 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject.boards.domain.exceptions;
// + 
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class BoardNotFoundException extends ApiException {
// +     public BoardNotFoundException() {
// +         super(HttpStatus.NOT_FOUND, "Quadro não encontrado");
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/exceptions/BoardUnauthorizedException.java (10 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject.boards.domain.exceptions;
// + 
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class BoardUnauthorizedException extends ApiException {
// +     public BoardUnauthorizedException() {
// +         super(HttpStatus.FORBIDDEN, "Você não tem permissão para excluir este quadro");
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/task/domain/exceptions/TaskNotFoundException.java (10 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject.task.domain.exceptions;
// + 
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class TaskNotFoundException extends ApiException {
// +     public TaskNotFoundException() {
// +         super(HttpStatus.NOT_FOUND, "Tarefa não encontrada");
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/exceptions/ColumnNotFoundException.java (10 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject.task_groups.domain.exceptions;
// + 
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class ColumnNotFoundException extends ApiException {
// +     public ColumnNotFoundException() {
// +         super(HttpStatus.NOT_FOUND, "Coluna não encontrada");
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/exceptions/EmailAlreadyExistsException.java (10 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject.users.domain.exceptions;
// + 
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class EmailAlreadyExistsException extends ApiException {
// +     public EmailAlreadyExistsException() {
// +         super(HttpStatus.CONFLICT, "Este e-mail já está em uso");
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/exceptions/InvalidCredentialsException.java (10 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject.users.domain.exceptions;
// + 
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class InvalidCredentialsException extends ApiException {
// +     public InvalidCredentialsException() {
// +         super(HttpStatus.UNAUTHORIZED, "E-mail ou senha não conferem.");
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/exceptions/InvalidCurrentPasswordException.java (10 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject.users.domain.exceptions;
// + 
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class InvalidCurrentPasswordException extends ApiException {
// +     public InvalidCurrentPasswordException() {
// +         super(HttpStatus.BAD_REQUEST, "A senha atual não confere");
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/exceptions/UserNotFoundException.java (10 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject.users.domain.exceptions;
// + 
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class UserNotFoundException extends ApiException {
// +     public UserNotFoundException() {
// +         super(HttpStatus.NOT_FOUND, "Usuário não encontrado");
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/authenticate/AuthenticateUser.java (30 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.authenticate;
// + 
// + import br.edu.ifce.mn.ads.ifproject._commons.security.JwtService;
// + import br.edu.ifce.mn.ads.ifproject.users.domain.exceptions.InvalidCredentialsException;
// + import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;
// + import org.springframework.stereotype.Component;
// + 
// + @Component
// + public class AuthenticateUser implements IAuthenticateUser {
// + 
// +     private final IUserRepository repository;
// +     private final JwtService jwtService;
// + 
// +     public AuthenticateUser(IUserRepository repository, JwtService jwtService) {
// +         this.repository = repository;
// +         this.jwtService = jwtService;
// +     }
// + 
// +     @Override
// +     public AuthenticateUserOutput execute(AuthenticateUserInput input) {
// +         final var user = repository.findByEmailAndPassword(input.email(), input.password())
// +                 .orElseThrow(InvalidCredentialsException::new);
// +         return new AuthenticateUserOutput(
// +                 user.id(),
// +                 user.username(),
// +                 user.email(),
// +                 jwtService.issue(user.id())
// +         );
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/authenticate/IAuthenticateUser.java (35 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.authenticate;
// + 
// + import br.edu.ifce.mn.ads.ifproject.users.domain.models.Password;
// + import jakarta.validation.Valid;
// + import jakarta.validation.constraints.Email;
// + import org.springframework.validation.annotation.Validated;
// + 
// + import java.util.UUID;
// + 
// + @Validated
// + public interface IAuthenticateUser {
// + 
// +     AuthenticateUserOutput execute(@Valid AuthenticateUserInput input);
// + 
// +     record AuthenticateUserInput(
// +             @Email(message = "Informe um e-mail válido") String email,
// +             @Password String password
// +     ) {
// +     }
// + 
// +     record AuthenticatedUser(
// +             UUID id,
// +             String username,
// +             String email
// +     ) {
// +     }
// + 
// +     record AuthenticateUserOutput(
// +             UUID id,
// +             String username,
// +             String email,
// +             String token
// +     ) {
// +     }
// + }


```

## `gradle/wrapper/gradle-wrapper.properties`

```properties
distributionBase=GRADLE_USER_HOME
distributionPath=wrapper/dists
distributionUrl=https\://services.gradle.org/distributions/gradle-9.4.1-bin.zip
networkTimeout=10000
validateDistributionUrl=true
zipStoreBase=GRADLE_USER_HOME
zipStorePath=wrapper/dists

```

## `gradlew`

```text
#!/bin/sh

#
# Copyright © 2015 the original authors.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
# SPDX-License-Identifier: Apache-2.0
#

##############################################################################
#
#   Gradle start up script for POSIX generated by Gradle.
#
#   Important for running:
#
#   (1) You need a POSIX-compliant shell to run this script. If your /bin/sh is
#       noncompliant, but you have some other compliant shell such as ksh or
#       bash, then to run this script, type that shell name before the whole
#       command line, like:
#
#           ksh Gradle
#
#       Busybox and similar reduced shells will NOT work, because this script
#       requires all of these POSIX shell features:
#         * functions;
#         * expansions «$var», «${var}», «${var:-default}», «${var+SET}»,
#           «${var#prefix}», «${var%suffix}», and «$( cmd )»;
#         * compound commands having a testable exit status, especially «case»;
#         * various built-in commands including «command», «set», and «ulimit».
#
#   Important for patching:
#
#   (2) This script targets any POSIX shell, so it avoids extensions provided
#       by Bash, Ksh, etc; in particular arrays are avoided.
#
#       The "traditional" practice of packing multiple parameters into a
#       space-separated string is a well documented source of bugs and security
#       problems, so this is (mostly) avoided, by progressively accumulating
#       options in "$@", and eventually passing that to Java.
#
#       Where the inherited environment variables (DEFAULT_JVM_OPTS, JAVA_OPTS,
#       and GRADLE_OPTS) rely on word-splitting, this is performed explicitly;
#       see the in-line comments for details.
#
#       There are tweaks for specific operating systems such as AIX, CygWin,
#       Darwin, MinGW, and NonStop.
#
#   (3) This script is generated from the Groovy template
#       https://github.com/gradle/gradle/blob/2d6327017519d23b96af35865dc997fcb544fb40/platforms/jvm/plugins-application/src/main/resources/org/gradle/api/internal/plugins/unixStartScript.txt
#       within the Gradle project.
#
#       You can find Gradle at https://github.com/gradle/gradle/.
#
##############################################################################

# Attempt to set APP_HOME

# Resolve links: $0 may be a link
app_path=$0

# Need this for daisy-chained symlinks.
while
    APP_HOME=${app_path%"${app_path##*/}"}  # leaves a trailing /; empty if no leading path
    [ -h "$app_path" ]
do
    ls=$( ls -ld "$app_path" )
    link=${ls#*' -> '}
    case $link in             #(
      /*)   app_path=$link ;; #(
      *)    app_path=$APP_HOME$link ;;
    esac
done

# This is normally unused
# shellcheck disable=SC2034
APP_BASE_NAME=${0##*/}
# Discard cd standard output in case $CDPATH is set (https://github.com/gradle/gradle/issues/25036)
APP_HOME=$( cd -P "${APP_HOME:-./}" > /dev/null && printf '%s\n' "$PWD" ) || exit

# Use the maximum available, or set MAX_FD != -1 to use that value.
MAX_FD=maximum

warn () {
    echo "$*"
} >&2

die () {
    echo
    echo "$*"
    echo
    exit 1
} >&2

# OS specific support (must be 'true' or 'false').
cygwin=false
msys=false
darwin=false
nonstop=false
case "$( uname )" in                #(
  CYGWIN* )         cygwin=true  ;; #(
  Darwin* )         darwin=true  ;; #(
  MSYS* | MINGW* )  msys=true    ;; #(
  NONSTOP* )        nonstop=true ;;
esac



# Determine the Java command to use to start the JVM.
if [ -n "$JAVA_HOME" ] ; then
    if [ -x "$JAVA_HOME/jre/sh/java" ] ; then
        # IBM's JDK on AIX uses strange locations for the executables
        JAVACMD=$JAVA_HOME/jre/sh/java
    else
        JAVACMD=$JAVA_HOME/bin/java
    fi
    if [ ! -x "$JAVACMD" ] ; then
        die "ERROR: JAVA_HOME is set to an invalid directory: $JAVA_HOME

Please set the JAVA_HOME variable in your environment to match the
location of your Java installation."
    fi
else
    JAVACMD=java
    if ! command -v java >/dev/null 2>&1
    then
        die "ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.

Please set the JAVA_HOME variable in your environment to match the
location of your Java installation."
    fi
fi

# Increase the maximum file descriptors if we can.
if ! "$cygwin" && ! "$darwin" && ! "$nonstop" ; then
    case $MAX_FD in #(
      max*)
        # In POSIX sh, ulimit -H is undefined. That's why the result is checked to see if it worked.
        # shellcheck disable=SC2039,SC3045
        MAX_FD=$( ulimit -H -n ) ||
            warn "Could not query maximum file descriptor limit"
    esac
    case $MAX_FD in  #(
      '' | soft) :;; #(
      *)
        # In POSIX sh, ulimit -n is undefined. That's why the result is checked to see if it worked.
        # shellcheck disable=SC2039,SC3045
        ulimit -n "$MAX_FD" ||
            warn "Could not set maximum file descriptor limit to $MAX_FD"
    esac
fi

# Collect all arguments for the java command, stacking in reverse order:
#   * args from the command line
#   * the main class name
#   * -classpath
#   * -D...appname settings
#   * --module-path (only if needed)
#   * DEFAULT_JVM_OPTS, JAVA_OPTS, and GRADLE_OPTS environment variables.

# For Cygwin or MSYS, switch paths to Windows format before running java
if "$cygwin" || "$msys" ; then
    APP_HOME=$( cygpath --path --mixed "$APP_HOME" )

    JAVACMD=$( cygpath --unix "$JAVACMD" )

    # Now convert the arguments - kludge to limit ourselves to /bin/sh
    for arg do
        if
            case $arg in                                #(
              -*)   false ;;                            # don't mess with options #(
              /?*)  t=${arg#/} t=/${t%%/*}              # looks like a POSIX filepath
                    [ -e "$t" ] ;;                      #(
              *)    false ;;
            esac
        then
            arg=$( cygpath --path --ignore --mixed "$arg" )
        fi
        # Roll the args list around exactly as many times as the number of
        # args, so each arg winds up back in the position where it started, but
        # possibly modified.
        #
        # NB: a `for` loop captures its iteration list before it begins, so
        # changing the positional parameters here affects neither the number of
        # iterations, nor the values presented in `arg`.
        shift                   # remove old arg
        set -- "$@" "$arg"      # push replacement arg
    done
fi


# Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS to pass JVM options to this script.
DEFAULT_JVM_OPTS='"-Xmx64m" "-Xms64m"'

# Collect all arguments for the java command:
#   * DEFAULT_JVM_OPTS, JAVA_OPTS, and optsEnvironmentVar are not allowed to contain shell fragments,
#     and any embedded shellness will be escaped.
#   * For example: A user cannot expect ${Hostname} to be expanded, as it is an environment variable and will be
#     treated as '${Hostname}' itself on the command line.

set -- \
        "-Dorg.gradle.appname=$APP_BASE_NAME" \
        -jar "$APP_HOME/gradle/wrapper/gradle-wrapper.jar" \
        "$@"

# Stop when "xargs" is not available.
if ! command -v xargs >/dev/null 2>&1
then
    die "xargs is not available"
fi

# Use "xargs" to parse quoted args.
#
# With -n1 it outputs one arg per line, with the quotes and backslashes removed.
#
# In Bash we could simply go:
#
#   readarray ARGS < <( xargs -n1 <<<"$var" ) &&
#   set -- "${ARGS[@]}" "$@"
#
# but POSIX shell has neither arrays nor command substitution, so instead we
# post-process each arg (as a line of input to sed) to backslash-escape any
# character that might be a shell metacharacter, then use eval to reverse
# that process (while maintaining the separation between arguments), and wrap
# the whole thing up as a single "set" statement.
#
# This will of course break if any of these variables contains a newline or
# an unmatched quote.
#

eval "set -- $(
        printf '%s\n' "$DEFAULT_JVM_OPTS $JAVA_OPTS $GRADLE_OPTS" |
        xargs -n1 |
        sed ' s~[^-[:alnum:]+,./:=@_]~\\&~g; ' |
        tr '\n' ' '
    )" '"$@"'

exec "$JAVACMD" "$@"

```

## `gradlew.bat`

```batch
@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem
@rem SPDX-License-Identifier: Apache-2.0
@rem

@if "%DEBUG%"=="" @echo off
@rem ##########################################################################
@rem
@rem  Gradle startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%"=="" set DIRNAME=.
@rem This is normally unused
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%

@rem Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@rem Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS="-Xmx64m" "-Xms64m"

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if %ERRORLEVEL% equ 0 goto execute

echo. 1>&2
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH. 1>&2
echo. 1>&2
echo Please set the JAVA_HOME variable in your environment to match the 1>&2
echo location of your Java installation. 1>&2

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto execute

echo. 1>&2
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME% 1>&2
echo. 1>&2
echo Please set the JAVA_HOME variable in your environment to match the 1>&2
echo location of your Java installation. 1>&2

goto fail

:execute
@rem Setup the command line



@rem Execute Gradle
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %GRADLE_OPTS% "-Dorg.gradle.appname=%APP_BASE_NAME%" -jar "%APP_HOME%\gradle\wrapper\gradle-wrapper.jar" %*

:end
@rem End local scope for the variables with windows NT shell
if %ERRORLEVEL% equ 0 goto mainEnd

:fail
rem Set variable GRADLE_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
set EXIT_CODE=%ERRORLEVEL%
if %EXIT_CODE% equ 0 set EXIT_CODE=1
if not ""=="%GRADLE_EXIT_CONSOLE%" exit %EXIT_CODE%
exit /b %EXIT_CODE%

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega

```

## `settings.gradle`

```groovy
rootProject.name = 'if-project'

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/Startup.java`

```java
package br.edu.ifce.mn.ads.ifproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Startup {

public static void main(String[] args) {
        SpringApplication.run(Startup.class, args);
    }

}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/UnauthenticatedException.java`

```java
package br.edu.ifce.mn.ads.ifproject._commons;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

public class UnauthenticatedException extends ApiException {

    public UnauthenticatedException() {
        super(HttpStatus.UNAUTHORIZED, "Usuário não autenticado");
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/UserLogged.java`

```java
package br.edu.ifce.mn.ads.ifproject._commons;

import java.util.UUID;

public interface UserLogged {

    ScopedValue<String> USER_ID = ScopedValue.newInstance();

    static boolean isValid() {
        return USER_ID.isBound() && USER_ID.get() != null;

    }

    static UUID id() {
        if (!UserLogged.isValid()) {
            throw new UnauthenticatedException();
        }
        return UUID.fromString(USER_ID.get());
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/http/ApiErrorJson.java`

```java
package br.edu.ifce.mn.ads.ifproject._commons.http;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import java.io.IOException;
import java.time.Instant;

public final class ApiErrorJson {

    private ApiErrorJson() {
    }

    public static void write(HttpServletResponse response, HttpStatus status, String message) throws IOException {
        response.setStatus(status.value());
        response.setCharacterEncoding("UTF-8");
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.getWriter().write("""
                {"status":%d,"error":"%s","message":"%s","timestamp":"%s","fields":{}}
                """.formatted(
                status.value(),
                escape(status.getReasonPhrase()),
                escape(message),
                Instant.now()
        ));
    }

    private static String escape(String value) {
        if (value == null) {
            return "";
        }
        return value.replace("\\", "\\\\").replace("\"", "\\\"");
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/http/ApiErrorResponse.java`

```java
package br.edu.ifce.mn.ads.ifproject._commons.http;

import org.springframework.http.HttpStatus;

import java.time.Instant;
import java.util.Map;

public record ApiErrorResponse(
        int status,
        String error,
        String message,
        String timestamp,
        Map<String, String> fields
) {
    public static ApiErrorResponse of(HttpStatus status, String message) {
        return of(status, message, Map.of());
    }

    public static ApiErrorResponse of(HttpStatus status, String message, Map<String, String> fields) {
        return new ApiErrorResponse(
                status.value(),
                status.getReasonPhrase(),
                message,
                Instant.now().toString(),
                fields == null ? Map.of() : fields
        );
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/http/ApiException.java`

```java
package br.edu.ifce.mn.ads.ifproject._commons.http;

import org.springframework.http.HttpStatus;

public class ApiException extends RuntimeException {

    private final HttpStatus status;

    public ApiException(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }

    public HttpStatus status() {
        return status;
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/http/ApiExceptionHandler.java`

```java
package br.edu.ifce.mn.ads.ifproject._commons.http;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.HandlerMethodValidationException;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.resource.NoResourceFoundException;
import tools.jackson.databind.exc.InvalidFormatException;

import java.util.LinkedHashMap;
import java.util.Map;

@Order(Ordered.HIGHEST_PRECEDENCE)
@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<ApiErrorResponse> handleApiException(ApiException ex) {
        return ResponseEntity.status(ex.status()).body(ApiErrorResponse.of(ex.status(), ex.getMessage()));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiErrorResponse> handleValidation(MethodArgumentNotValidException ex) {
        Map<String, String> fields = new LinkedHashMap<>();
        for (FieldError error : ex.getBindingResult().getFieldErrors()) {
            fields.put(error.getField(), messageOrDefault(error.getDefaultMessage()));
        }
        return badRequest("Dados inválidos", fields);
    }

    @ExceptionHandler(HandlerMethodValidationException.class)
    public ResponseEntity<ApiErrorResponse> handleMethodValidation(HandlerMethodValidationException ex) {
        Map<String, String> fields = new LinkedHashMap<>();
        ex.getAllErrors().forEach(error -> {
            if (error instanceof FieldError fieldError) {
                fields.put(fieldError.getField(), messageOrDefault(fieldError.getDefaultMessage()));
            } else {
                fields.put("request", messageOrDefault(error.getDefaultMessage()));
            }
        });
        return badRequest("Dados inválidos", fields);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ApiErrorResponse> handleConstraint(ConstraintViolationException ex) {
        Map<String, String> fields = new LinkedHashMap<>();
        for (ConstraintViolation<?> violation : ex.getConstraintViolations()) {
            fields.put(fieldName(violation), messageOrDefault(violation.getMessage()));
        }
        return badRequest("Dados inválidos", fields);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ApiErrorResponse> handleUnreadable(HttpMessageNotReadableException ex) {
        Throwable cause = ex.getCause();
        if (cause instanceof InvalidFormatException invalidFormat && invalidFormat.getTargetType() != null) {
            String field = invalidFormat.getPath() == null || invalidFormat.getPath().isEmpty()
                    ? "request"
                    : invalidFormat.getPath().getFirst().getPropertyName();
            String message = invalidFormat.getTargetType().isEnum()
                    ? "Valor inválido para " + field
                    : "Formato inválido para " + field;
            return badRequest(message, Map.of(field, message));
        }
        return badRequest("JSON inválido. Verifique os campos enviados.", Map.of());
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseEntity<ApiErrorResponse> handleMissingParam(MissingServletRequestParameterException ex) {
        return badRequest(
                "Parâmetro obrigatório ausente",
                Map.of(ex.getParameterName(), "Este parâmetro é obrigatório")
        );
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<ApiErrorResponse> handleTypeMismatch(MethodArgumentTypeMismatchException ex) {
        String name = ex.getName() == null ? "request" : ex.getName();
        return badRequest("Valor inválido", Map.of(name, "Formato inválido"));
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<ApiErrorResponse> handleMethodNotAllowed(HttpRequestMethodNotSupportedException ex) {
        return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(ApiErrorResponse.of(
                HttpStatus.METHOD_NOT_ALLOWED,
                "Método HTTP não permitido"
        ));
    }

    @ExceptionHandler(NoResourceFoundException.class)
    public ResponseEntity<ApiErrorResponse> handleNotFound(NoResourceFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ApiErrorResponse.of(
                HttpStatus.NOT_FOUND,
                "Recurso não encontrado"
        ));
    }

    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity<ApiErrorResponse> handleEmptyResult(EmptyResultDataAccessException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ApiErrorResponse.of(
                HttpStatus.NOT_FOUND,
                "Recurso não encontrado"
        ));
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<ApiErrorResponse> handleIntegrity(DataIntegrityViolationException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(ApiErrorResponse.of(
                HttpStatus.CONFLICT,
                "Não foi possível salvar. Registro duplicado ou referência inválida."
        ));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiErrorResponse> handleUnexpected(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ApiErrorResponse.of(
                HttpStatus.INTERNAL_SERVER_ERROR,
                "Erro interno. Tente novamente."
        ));
    }

    private static ResponseEntity<ApiErrorResponse> badRequest(String message, Map<String, String> fields) {
        return ResponseEntity.badRequest().body(ApiErrorResponse.of(HttpStatus.BAD_REQUEST, message, fields));
    }

    private static String fieldName(ConstraintViolation<?> violation) {
        String path = violation.getPropertyPath().toString();
        int lastDot = path.lastIndexOf('.');
        return lastDot >= 0 ? path.substring(lastDot + 1) : path;
    }

    private static String messageOrDefault(String message) {
        return message == null || message.isBlank() ? "Valor inválido" : message;
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/security/CorsProperties.java`

```java
package br.edu.ifce.mn.ads.ifproject._commons.security;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties(prefix = "app.cors")
public record CorsProperties(List<String> allowedOrigins) {
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/security/JwtAuthenticationFilter.java`

```java
package br.edu.ifce.mn.ads.ifproject._commons.security;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject._commons.http.ApiErrorJson;
import io.jsonwebtoken.JwtException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final JwtService jwtService;

    public JwtAuthenticationFilter(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain
    ) throws ServletException, IOException {
        final var header = request.getHeader(HttpHeaders.AUTHORIZATION);
        if (header == null || !header.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
            return;
        }

        final UUID userId;
        try {
            userId = jwtService.parseUserId(header.substring("Bearer ".length()));
        } catch (JwtException | IllegalArgumentException ex) {
            writeUnauthorized(response, "Token inválido ou expirado");
            return;
        }

        final var authentication = new UsernamePasswordAuthenticationToken(userId, null, List.of());
        authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
        SecurityContextHolder.getContext().setAuthentication(authentication);

        try {
            ScopedValue.where(UserLogged.USER_ID, userId.toString()).run(() -> {
                try {
                    filterChain.doFilter(request, response);
                } catch (IOException | ServletException e) {
                    throw new FilterChainException(e);
                }
            });
        } catch (FilterChainException e) {
            if (e.getCause() instanceof IOException ioException) {
                throw ioException;
            }
            if (e.getCause() instanceof ServletException servletException) {
                throw servletException;
            }
            throw new ServletException(e.getCause());
        }
    }

    private static void writeUnauthorized(HttpServletResponse response, String message) throws IOException {
        ApiErrorJson.write(response, HttpStatus.UNAUTHORIZED, message);
    }

    private static final class FilterChainException extends RuntimeException {
        private FilterChainException(Throwable cause) {
            super(cause);
        }
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/security/JwtProperties.java`

```java
package br.edu.ifce.mn.ads.ifproject._commons.security;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.time.Duration;

@ConfigurationProperties(prefix = "app.jwt")
public record JwtProperties(
        String secret,
        Duration expiration,
        Duration refreshExpiration
) {
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/security/JwtService.java`

```java
package br.edu.ifce.mn.ads.ifproject._commons.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Date;
import java.util.UUID;

@Component
public class JwtService {

    private final JwtProperties properties;
    private final SecretKey key;

    public JwtService(JwtProperties properties) {
        this.properties = properties;
        this.key = Keys.hmacShaKeyFor(properties.secret().getBytes(StandardCharsets.UTF_8));
    }

    public String issue(UUID userId) {
        final var now = Instant.now();
        return Jwts.builder()
                .subject(userId.toString())
                .issuedAt(Date.from(now))
                .expiration(Date.from(now.plus(properties.expiration())))
                .signWith(key)
                .compact();
    }

    public UUID parseUserId(String token) {
        final var subject = Jwts.parser()
                .verifyWith(key)
                .build()
                .parseSignedClaims(token)
                .getPayload()
                .getSubject();
        return UUID.fromString(subject);
    }

    public long expirationSeconds() {
        return properties.expiration().toSeconds();
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/security/OpenApiConfig.java`

```java
package br.edu.ifce.mn.ads.ifproject._commons.security;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    OpenAPI openAPI() {
        final var schemeName = "bearer-jwt";
        return new OpenAPI()
                .components(new Components().addSecuritySchemes(schemeName, new SecurityScheme()
                        .type(SecurityScheme.Type.HTTP)
                        .scheme("bearer")
                        .bearerFormat("JWT")))
                .addSecurityItem(new SecurityRequirement().addList(schemeName));
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/security/RefreshTokenService.java`

```java
package br.edu.ifce.mn.ads.ifproject._commons.security;

import br.edu.ifce.mn.ads.ifproject.users.domain.exceptions.InvalidCredentialsException;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.UUID;

@Component
public class RefreshTokenService {

    private static final SecureRandom RANDOM = new SecureRandom();

    private final JdbcClient db;
    private final JwtProperties properties;

    public RefreshTokenService(JdbcClient db, JwtProperties properties) {
        this.db = db;
        this.properties = properties;
    }

    public String issue(UUID userId) {
        byte[] bytes = new byte[48];
        RANDOM.nextBytes(bytes);
        String token = Base64.getUrlEncoder().withoutPadding().encodeToString(bytes);
        db.sql("""
                        INSERT INTO refresh_tokens(user_id, token_hash, expires_at)
                        VALUES (?, ?, CURRENT_TIMESTAMP + (? * INTERVAL '1 second'))
                        """)
                .params(userId, sha256(token), properties.refreshExpiration().toSeconds())
                .update();
        return token;
    }

    /** Consome o token e devolve o usuário; o chamador deve emitir o substituto. */
    public UUID consume(String token) {
        return db.sql("""
                        UPDATE refresh_tokens
                        SET revoked_at = CURRENT_TIMESTAMP
                        WHERE token_hash = ?
                          AND revoked_at IS NULL
                          AND expires_at > CURRENT_TIMESTAMP
                        RETURNING user_id
                        """)
                .param(sha256(token))
                .query(UUID.class)
                .optional()
                .orElseThrow(InvalidCredentialsException::new);
    }

    private static String sha256(String value) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256")
                    .digest(value.getBytes(StandardCharsets.UTF_8));
            StringBuilder result = new StringBuilder(64);
            for (byte valueByte : digest) {
                result.append(String.format("%02x", valueByte));
            }
            return result.toString();
        } catch (NoSuchAlgorithmException ex) {
            throw new IllegalStateException("Algoritmo SHA-256 indisponível", ex);
        }
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/security/SecurityConfig.java`

```java
package br.edu.ifce.mn.ads.ifproject._commons.security;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiErrorJson;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.List;

@Configuration
@EnableWebSecurity
@EnableConfigurationProperties({JwtProperties.class, CorsProperties.class})
public class SecurityConfig {

    private final CorsProperties corsProperties;

    public SecurityConfig(CorsProperties corsProperties) {
        this.corsProperties = corsProperties;
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    JwtAuthenticationFilter jwtAuthenticationFilter(JwtService jwtService) {
        return new JwtAuthenticationFilter(jwtService);
    }

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http, JwtAuthenticationFilter jwtAuthenticationFilter) throws Exception {
        return http
                .csrf(csrf -> csrf.disable())
                .cors(Customizer.withDefaults())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers(HttpMethod.OPTIONS, "/**").permitAll()
                        .requestMatchers(HttpMethod.POST, "/api/v1/users", "/api/v1/users/login", "/api/v1/auth/login", "/api/v1/auth/refresh").permitAll()
                        .requestMatchers(
                                "/swagger-ui/**",
                                "/swagger-ui.html",
                                "/v3/api-docs/**",
                                "/error"
                        ).permitAll()
                        .anyRequest().authenticated()
                )
                .exceptionHandling(handling -> handling
                        .authenticationEntryPoint((request, response, ex) ->
                                ApiErrorJson.write(response, HttpStatus.UNAUTHORIZED, "Não autenticado")
                        )
                        .accessDeniedHandler((request, response, ex) ->
                                ApiErrorJson.write(response, HttpStatus.FORBIDDEN, "Você não tem permissão para esta ação")
                        )
                )
                .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
                .build();
    }

    @Bean
    CorsConfigurationSource corsConfigurationSource() {
        final var config = new CorsConfiguration();
        config.setAllowedOrigins(corsProperties.allowedOrigins());
        config.setAllowedMethods(List.of("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"));
        config.setAllowedHeaders(List.of("*"));
        config.setExposedHeaders(List.of("Authorization"));
        config.setAllowCredentials(true);

        final var source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        return source;
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/boards/application/controllers/BoardController.java`

```java
package br.edu.ifce.mn.ads.ifproject.boards.application.controllers;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.create.ICreateBoard;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.delete.IDeleteBoard;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.duplicate.IDuplicateBoard;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.findBoardsByProject.IFindBoardsByProject;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.read.IReadBoard;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.update.IUpdateBoard;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/boards")
public class BoardController {

    private final ICreateBoard createBoard;
    private final IReadBoard readBoard;
    private final IUpdateBoard updateBoard;
    private final IFindBoardsByProject findByProject;
    private final IDeleteBoard deleteBoard;
//    private final IArchiveBoard archiveBoard;
    private final IDuplicateBoard duplicateBoard;

    public BoardController(ICreateBoard createBoard,
                           IReadBoard readBoard,
                           IUpdateBoard updateBoard,
                           IFindBoardsByProject findByProject,
                           IDeleteBoard deleteBoard,
//                           IArchiveBoard archiveBoard,
                           IDuplicateBoard duplicateBoard
    ) {
        this.createBoard = createBoard;
        this.readBoard = readBoard;
        this.updateBoard = updateBoard;
        this.findByProject = findByProject;
        this.deleteBoard = deleteBoard;
//        this.archiveBoard = archiveBoard;
        this.duplicateBoard = duplicateBoard;
    }

    public record DuplicateBoardPayload(String newBoardName) {
    }

    @PostMapping
    public ICreateBoard.CreateBoardOutput post(@RequestBody ICreateBoard.CreateBoardInput input) {
        return createBoard.execute(input);
    }

    @GetMapping(value = "/{id}")
    public IReadBoard.ReadBoardOutput get(@PathVariable UUID id) {
        return readBoard.execute(new IReadBoard.ReadBoardInput(id));
    }

    @PatchMapping(value = "/{id}")
    public IUpdateBoard.UpdateBoardOutput patch(@PathVariable UUID id, @RequestBody IUpdateBoard.UpdateBoardInput input) {
        return updateBoard.execute(id, input);
    }

    @GetMapping(value = "/project/{projectId}")
    public IFindBoardsByProject.FindBoardsByProjectOutput getByProjectId(@PathVariable UUID projectId) {
        return findByProject.execute(new IFindBoardsByProject.FindBoardsByProjectInput(projectId));
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable UUID id) {
        deleteBoard.execute(id, UserLogged.id());
    }

//    @PatchMapping("{board_id}/archive")
//    public IArchiveBoard.ArchiveBoardOutput patch(
//            @PathVariable("board_id") UUID id
//    ) {
//        return archiveBoard.execute(id);
//    }

    @PostMapping(value = "/{id}/duplicate")
    @ResponseStatus(HttpStatus.CREATED)
    public IDuplicateBoard.DuplicateBoardOutput duplicate(
            @PathVariable UUID id,
            @RequestBody BoardController.DuplicateBoardPayload payload
    ) {
        var input = new IDuplicateBoard.DuplicateBoardInput(
                id,
                payload.newBoardName(),
                UserLogged.id()
        );

        return duplicateBoard.execute(input);
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/exceptions/BoardNotFoundException.java`

```java
package br.edu.ifce.mn.ads.ifproject.boards.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

public class BoardNotFoundException extends ApiException {
    public BoardNotFoundException() {
        super(HttpStatus.NOT_FOUND, "Quadro não encontrado");
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/exceptions/BoardUnauthorizedException.java`

```java
package br.edu.ifce.mn.ads.ifproject.boards.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

public class BoardUnauthorizedException extends ApiException {
    public BoardUnauthorizedException() {
        super(HttpStatus.FORBIDDEN, "Você não tem permissão para excluir este quadro");
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/infra/repositories/BoardRepository.java`

```java
package br.edu.ifce.mn.ads.ifproject.boards.domain.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.create.ICreateBoard;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.findBoardsByProject.IFindBoardsByProject;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.read.IReadBoard;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.update.IUpdateBoard;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class BoardRepository implements IBoardRepository{

    private JdbcClient db;

    public BoardRepository(JdbcClient db) {
        this.db = db;
    }

    public UUID persist(ICreateBoard.CreateBoardInput input){
        final var SQL = "INSERT INTO boards (name, project_id) values (?,?) returning id";

        final var id = db.sql(SQL)
                .param(input.name())
                .param(input.projectId())
                .query(UUID.class)
                .single();

        return id;
    }

    public IReadBoard.ReadBoardOutput find(IReadBoard.ReadBoardInput input){
        final var SQL = "SELECT name, project_id, color_hex, is_archived FROM boards WHERE id = (?)";

        return db.sql(SQL)
                .param(input.id())
                .query((rs, rowNum) -> new IReadBoard.ReadBoardOutput(
                        rs.getString("name"),
                        rs.getObject("project_id", UUID.class),
                        rs.getString("color_hex"),
                        rs.getBoolean("is_archived")
                ))
                .single();
    }

    public UUID update(UUID id, IUpdateBoard.UpdateBoardInput input){

        final var SQL = "UPDATE boards set name = COALESCE(?, name), color_hex = COALESCE(?, color_hex) where id = (?)";

        db.sql(SQL)
                .param(input.name())
                .param(input.color())
                .param(id)
                .update();

        return id;
    }

    @Override
    public List<IFindBoardsByProject.BoardItem> findByProjectId(UUID projectId) {

        final var SQL = "SELECT id, name, color_hex, is_archived FROM boards WHERE project_id = (?) AND is_archived is false";

        return db.sql(SQL)
                .param(projectId)
                .query((rs, rowNum) -> new IFindBoardsByProject.BoardItem(
                        rs.getObject("id", UUID.class),
                        rs.getString("name"),
                        rs.getString("color_hex"),
                        rs.getBoolean("is_archived")
                ))
                .list();
    }

    @Override
    public boolean exists(UUID id) {
        return db.sql("SELECT EXISTS(SELECT 1 FROM boards WHERE id = ?)")
                .param(id)
                .query(Boolean.class)
                .single();
    }

    @Override
    public boolean isUserAuthorizedToDelete(UUID boardId, UUID userId) {
        final var SQL = """
                SELECT EXISTS (
                    SELECT 1
                    FROM boards b
                    JOIN projects p ON b.project_id = p.id
                    LEFT JOIN project_members pm ON pm.project_id = p.id AND pm.user_id = ?
                    WHERE b.id = ? AND (p.owner_id = ? OR pm.role = 'ADMIN')
                )
                """;

        return db.sql(SQL)
                .param(userId)
                .param(boardId)
                .param(userId)
                .query(Boolean.class)
                .single();
    }

    @Override
    public void delete(UUID boardId) {
        final var SQL = "DELETE FROM boards WHERE id = (?)";

        db.sql(SQL)
                .param(boardId)
                .update();
    }

    public UUID duplicateBoardData(UUID originalBoardId, String newName){

        final var SQL = """
            INSERT INTO boards (name, project_id, color_hex, is_archived)
            SELECT ?, project_id, color_hex, false
            FROM boards WHERE id = ?
            RETURNING id
            """;;

        return db.sql(SQL)
                .param(newName)
                .param(originalBoardId)
                .query(UUID.class)
                .single();
    }

    public void duplicateTaskGroups(UUID originalBoardId, UUID newBoardId){

        final var SQL = """
            INSERT INTO task_groups (name, position, board_id)
            SELECT name, position, ?
            FROM task_groups WHERE board_id = ?
            """;

        db.sql(SQL)
                .param(newBoardId)
                .param(originalBoardId)
                .update();
    }

}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/infra/repositories/IBoardRepository.java`

```java
package br.edu.ifce.mn.ads.ifproject.boards.domain.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.create.ICreateBoard;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.findBoardsByProject.IFindBoardsByProject;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.read.IReadBoard;
import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.update.IUpdateBoard;

import java.util.List;
import java.util.UUID;

public interface IBoardRepository {

    UUID persist(ICreateBoard.CreateBoardInput input);

    IReadBoard.ReadBoardOutput find(IReadBoard.ReadBoardInput input);

    UUID update(UUID id, IUpdateBoard.UpdateBoardInput input);

    List<IFindBoardsByProject.BoardItem> findByProjectId(UUID projectId);

    boolean exists(UUID id);

    boolean isUserAuthorizedToDelete(UUID boardId, UUID userId);
    void delete(UUID boardId);

    UUID duplicateBoardData(UUID originalBoardId, String newName);
    void duplicateTaskGroups(UUID originalBoardId, UUID newBoardId);
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/archive/ArchiveBoard.java`

```java
//package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.archive;
//
//import br.edu.ifce.mn.ads.ifproject.boards.domain.models.Board;
//import br.edu.ifce.mn.ads.ifproject.boards.infra.repositories.IBoardRepository;
//import org.springframework.stereotype.Service;
//import java.util.UUID;
//
//@Service
//public class ArchiveBoard implements IArchiveBoard {
//
//    // Dependência do repositório de banco de dados
//    private final IBoardRepository boardRepository;
//
//    // Injeção de dependência por construtor
//    public ArchiveBoard(IBoardRepository boardRepository) {
//        this.boardRepository = boardRepository;
//    }
//
//    @Override
//    public ArchiveBoardOutput execute(UUID id) {
//        // 1. Busca o quadro no banco pelo UUID. Se não achar, lança um erro.
//        Board board = boardRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Quadro não encontrado com o ID: " + id));
//
//        // 2. Aplica a regra de negócio: muda o status para arquivado (true)
//        board.setArchived(true);
//
//        // 3. Salva a alteração de volta no PostgreSQL
//        Board updatedBoard = boardRepository.save(board);
//
//        // 4. Devolve o Output
//        return new ArchiveBoardOutput(
//                updatedBoard.getId(),
//                updatedBoard.getName(),
//                updatedBoard.isArchived()
//        );
//    }
//}
```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/archive/IArchiveBoard.java`

```java
package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.archive;

import java.util.UUID;

public interface IArchiveBoard {

    // O método principal que o Controller vai chamar
    ArchiveBoardOutput execute(UUID id);

    // Record é uma forma moderna em Java de criar classes de dados puras (só getters)
    // Aqui define o que o caso de uso devolve quando termina
    public record ArchiveBoardOutput(
            UUID id,
            String name,
            boolean isArchived
    ) {}
}
```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/create/CreateBoard.java`

```java
package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.create;

import br.edu.ifce.mn.ads.ifproject.boards.domain.infra.repositories.IBoardRepository;
import org.springframework.stereotype.Component;

@Component
public class CreateBoard implements ICreateBoard{

    private final IBoardRepository repository;

    public CreateBoard(IBoardRepository repository) {
        this.repository = repository;
    }

    @Override
    public CreateBoardOutput execute(CreateBoardInput input) {

        final var id = repository.persist(input);

        return new CreateBoardOutput(id);
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/create/ICreateBoard.java`

```java
package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.create;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface ICreateBoard {

    CreateBoardOutput execute(@Valid CreateBoardInput input);

    record CreateBoardInput(
            @NotBlank(message = "O nome do quadro é obrigatório e não pode ser vazio")
            @Size(min = 3, max = 30)
            String name,

            @NotNull(message = "O id do projeto é obrigatório")
            UUID projectId
    )
    {}

    record CreateBoardOutput(
            UUID id
    )
    {}

}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/delete/DeleteBoard.java`

```java
package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.delete;

import br.edu.ifce.mn.ads.ifproject.boards.domain.exceptions.BoardNotFoundException;
import br.edu.ifce.mn.ads.ifproject.boards.domain.exceptions.BoardUnauthorizedException;
import br.edu.ifce.mn.ads.ifproject.boards.domain.infra.repositories.IBoardRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class DeleteBoard implements IDeleteBoard{

    private final IBoardRepository repository;

    public DeleteBoard(IBoardRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute(UUID boardId, UUID userId) {
        if (!repository.exists(boardId)) {
            throw new BoardNotFoundException();
        }

        if (!repository.isUserAuthorizedToDelete(boardId, userId)) {
            throw new BoardUnauthorizedException();
        }

        repository.delete(boardId);
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/delete/IDeleteBoard.java`

```java
package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.delete;

import java.util.UUID;

public interface IDeleteBoard {

    void execute(UUID boardId, UUID userId);

}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/duplicate/DuplicateBoard.java`

```java
package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.duplicate;

import br.edu.ifce.mn.ads.ifproject.boards.domain.exceptions.BoardNotFoundException;
import br.edu.ifce.mn.ads.ifproject.boards.domain.infra.repositories.IBoardRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Component
public class DuplicateBoard implements IDuplicateBoard{

    private final IBoardRepository repository;

    public DuplicateBoard(IBoardRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public DuplicateBoardOutput execute(DuplicateBoardInput input) {
        if (!repository.exists(input.originalBoardId())) {
            throw new BoardNotFoundException();
        }

        UUID newBoardId = repository.duplicateBoardData(input.originalBoardId(), input.newBoardName());

        repository.duplicateTaskGroups(input.originalBoardId(), newBoardId);

        return new DuplicateBoardOutput(newBoardId);
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/duplicate/IDuplicateBoard.java`

```java
package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.duplicate;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface IDuplicateBoard {

    DuplicateBoardOutput execute(@Valid DuplicateBoardInput input);

    record DuplicateBoardInput(
            @NotNull
            UUID originalBoardId,

            @NotBlank
            String newBoardName,

            @NotNull
            UUID requesterId
    ){}

    record DuplicateBoardOutput(
            UUID newBoardId
    ){}

}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/findBoardsByProject/FindBoardsByProject.java`

```java
package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.findBoardsByProject;

import br.edu.ifce.mn.ads.ifproject.boards.domain.infra.repositories.IBoardRepository;
import org.springframework.stereotype.Component;

@Component
public class FindBoardsByProject implements IFindBoardsByProject{

    private final IBoardRepository repository;

    public FindBoardsByProject(IBoardRepository repository) {
        this.repository = repository;
    }

    @Override
    public FindBoardsByProjectOutput execute(FindBoardsByProjectInput input) {

        var boards = repository.findByProjectId(input.projectId());

        return new FindBoardsByProjectOutput(boards);
    }

}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/findBoardsByProject/IFindBoardsByProject.java`

```java
package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.findBoardsByProject;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.UUID;

@Validated
public interface IFindBoardsByProject {

    FindBoardsByProjectOutput execute(@Valid FindBoardsByProjectInput input);

    record FindBoardsByProjectInput(
            @NotNull(message = "O ID do projeto é obrigatório para realizar a listagem")
            UUID projectId
    ){}

    record FindBoardsByProjectOutput(
            List<BoardItem> boards
    ){}

    record BoardItem(
            UUID id,
            String name,
            String colorHex,
            boolean isArchived
    ){}

}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/read/IReadBoard.java`

```java
package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.read;

import java.util.UUID;

public interface IReadBoard {

    ReadBoardOutput execute(ReadBoardInput input);

    record ReadBoardInput(
            UUID id
    ){}

    record ReadBoardOutput(
            String name,
            UUID projectId,
            String hexColor,
            boolean isArchived
    ){}

}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/read/ReadBoard.java`

```java
package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.read;

import br.edu.ifce.mn.ads.ifproject.boards.domain.exceptions.BoardNotFoundException;
import br.edu.ifce.mn.ads.ifproject.boards.domain.infra.repositories.IBoardRepository;
import org.springframework.stereotype.Component;

@Component
public class ReadBoard implements IReadBoard{

    private final IBoardRepository repository;

    public ReadBoard(IBoardRepository repository){this.repository = repository;}

    @Override
    public ReadBoardOutput execute(ReadBoardInput input) {
        if (!repository.exists(input.id())) {
            throw new BoardNotFoundException();
        }
        return repository.find(input);
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/update/IUpdateBoard.java`

```java
package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.update;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface IUpdateBoard {

    UpdateBoardOutput execute (UUID id, @Valid UpdateBoardInput input);

    record UpdateBoardInput(
            @Size(min = 3, max = 30, message = "O nome do quadro deve ter entre 3 e 30 caracteres")
            String name,
            String color
    ){}

    record UpdateBoardOutput(
            UUID id
    ){}

}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/update/UpdateBoard.java`

```java
package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.update;

import br.edu.ifce.mn.ads.ifproject.boards.domain.exceptions.BoardNotFoundException;
import br.edu.ifce.mn.ads.ifproject.boards.domain.infra.repositories.IBoardRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UpdateBoard implements IUpdateBoard{

    private final IBoardRepository repository;

    public UpdateBoard(IBoardRepository repository) {
        this.repository = repository;
    }


    @Override
    public UpdateBoardOutput execute(UUID id, UpdateBoardInput input) {
        if (!repository.exists(id)) {
            throw new BoardNotFoundException();
        }
        final var boardId = repository.update(id, input);

        return new UpdateBoardOutput(boardId);
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/boards/infra/repositories/IBoardRepository.java`

```java
//package br.edu.ifce.mn.ads.ifproject.boards.infra.repositories;
//
//import br.edu.ifce.mn.ads.ifproject.boards.domain.models.Board;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//import java.util.UUID;
//
//@Repository
//public interface IBoardRepository extends JpaRepository<Board, UUID> {
//    // O Spring Data JPA vai olhar e saber que a tabela usa UUID como chave primária.
//}
```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/application/controllers/ProjectController.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.application.controllers;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.archive_project.IArchiveProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project.ICreateProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.restore_project.IRestoreProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.transfer_ownership.ITransferOwnership;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_member_role.IUpdateMemberRole;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_project.IUpdateProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.delete_project.IDeleteProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.find_project.IFindProjectByIdAndUserId;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.list_members.IListMembers;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.list_projects.IListProjects;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.list_archived_projects.IListArchivedProjects;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.add_member.IAddMember;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.remove_member.IRemoveMember;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectMemberRepository;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/projects")
public class ProjectController {

    private final ICreateProject createProject;
    private final IUpdateProject updateProject;
    private final IDeleteProject deleteProject;
    private final IListProjects listProjects;
    private final IListArchivedProjects listArchivedProjects;
    private final IFindProjectByIdAndUserId findProject;
    private final IAddMember addMember;
    private final IRemoveMember removeMember;
    private final IArchiveProject archiveProject;
    private final IRestoreProject restoreProject;
    private final ITransferOwnership transferOwnership;
    private final IUpdateMemberRole updateMemberRole;
    private final IListMembers listMembers;

    public ProjectController(ICreateProject createProject,
                             IUpdateProject updateProject,
                             IDeleteProject deleteProject,
                             IListProjects listProjects,
                             IListArchivedProjects listArchivedProjects,
                             IFindProjectByIdAndUserId findProject,
                             IAddMember addMember,
                             IRemoveMember removeMember,
                             IArchiveProject archiveProject,
                             IRestoreProject restoreProject,
                             ITransferOwnership transferOwnership,
                             IUpdateMemberRole updateMemberRole,
                             IListMembers listMembers) {
        this.createProject = createProject;
        this.updateProject = updateProject;
        this.deleteProject = deleteProject;
        this.listProjects = listProjects;
        this.listArchivedProjects = listArchivedProjects;
        this.findProject = findProject;
        this.addMember = addMember;
        this.removeMember = removeMember;
        this.archiveProject = archiveProject;
        this.restoreProject = restoreProject;
        this.updateMemberRole = updateMemberRole;
        this.listMembers = listMembers;
        this.transferOwnership = transferOwnership;
    }

    @PostMapping
    public ICreateProject.CreateProjectOutput post(@RequestBody ICreateProject.CreateProjectInput body) {
        return createProject.execute(body);
    }

    @PutMapping("/{id}")
    public IUpdateProject.UpdateProjectOutput update(
            @PathVariable UUID id,
            @RequestBody IUpdateProject.UpdateProjectInput input) {

        return updateProject.execute(id, input);
    }

    @GetMapping
    public List<IProjectRepository.ListProjectsOutput> get(Pageable pageable) {
        return listProjects.execute(pageable);

    }

    @GetMapping("/{id}")
    public IProjectRepository.FindProjectOutput getById(
            @PathVariable UUID id) {

        return findProject.execute(id);
    }

    @DeleteMapping("/{id}")
    public IDeleteProject.DeleteProjectOutput delete(@PathVariable UUID id) {
        return deleteProject.execute(id);

    }

    @PostMapping("/{id}/members")
    public IAddMember.AddMemberOutput postMember(
            @PathVariable UUID id,
            @RequestBody IAddMember.AddMemberInput input) {
        return addMember.execute(id, input);
    }

    @DeleteMapping("/{id}/members/{userId}")
    public IRemoveMember.RemoveMemberOutput deleteMember(
            @PathVariable UUID id,
            @PathVariable UUID userId) {
        return removeMember.execute(id, userId);
    }

    @PatchMapping("/{id}/archive")
    public IArchiveProject.ArchiveProjectOutput archive(@PathVariable UUID id) {
        return archiveProject.execute(id);

    }

    @PatchMapping("/{id}/restore")
    public IRestoreProject.RestoreProjectOutput restore(@PathVariable UUID id) {
        return restoreProject.execute(id);

    }

    @GetMapping("/archived")
    public List<IListArchivedProjects.IListArchivedProjectsOutput> getArchived(Pageable pageable) {
        return listArchivedProjects.execute(pageable);
    }

    @GetMapping("/{id}/members")
    public List<IProjectMemberRepository.ListMembersOutput> getMembers(
            @PathVariable UUID id, Pageable pageable) {
        return listMembers.execute(id, pageable);
    }

    @PatchMapping("/{id}/members/{userId}")
    public IUpdateMemberRole.UpdateMemberRoleOutput patchMemberRole(
            @PathVariable UUID id,
            @PathVariable UUID userId,
            @RequestBody IUpdateMemberRole.UpdateMemberRoleInput input) {
        return updateMemberRole.execute(id, userId, input);
    }

    @PatchMapping("/{id}/transfer")
    public ITransferOwnership.TransferOwnershipOutput transfer(
            @PathVariable UUID id,
            @RequestBody ITransferOwnership.TransferOwnershipInput input) {
        return transferOwnership.execute(id, input);
    }


}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/enums/ProjectRole.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.enums;

public enum ProjectRole {
    OWNER,
    ADMIN,
    MEMBER,
    VIEWER;

    public boolean canEdit() {
        return this == OWNER || this == ADMIN;

    }

    public boolean isOwner() {
        return this == OWNER;

    }
}
```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/CannotRemoveOwnerException.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

public class CannotRemoveOwnerException extends ApiException {

    public CannotRemoveOwnerException() {
        super(HttpStatus.UNPROCESSABLE_ENTITY, "Não é possível remover o dono do projeto");
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/CannotTransferToNonMemberException.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

import java.util.UUID;

public class CannotTransferToNonMemberException extends ApiException {

    public CannotTransferToNonMemberException(UUID userId) {
        super(HttpStatus.UNPROCESSABLE_ENTITY, "Só é possível transferir o projeto para um membro");
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/InsufficientPermissionException.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

public class InsufficientPermissionException extends ApiException {

    public InsufficientPermissionException() {
        super(HttpStatus.FORBIDDEN, "Você não tem permissão para realizar esta ação");
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/MemberAlreadyExistsException.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

import java.util.UUID;

public class MemberAlreadyExistsException extends ApiException {

    public MemberAlreadyExistsException(UUID projectId, UUID userId) {
        super(HttpStatus.CONFLICT, "Este membro já está no projeto");
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/MemberNotFoundException.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

import java.util.UUID;

public class MemberNotFoundException extends ApiException {

    public MemberNotFoundException(UUID userId) {
        super(HttpStatus.NOT_FOUND, "Membro não encontrado neste projeto");
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/ProjectAlreadyArchivedException.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

import java.util.UUID;

public class ProjectAlreadyArchivedException extends ApiException {

    public ProjectAlreadyArchivedException(UUID id) {
        super(HttpStatus.CONFLICT, "Este projeto já está arquivado");
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/ProjectNotArchivedException.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

import java.util.UUID;

public class ProjectNotArchivedException extends ApiException {

    public ProjectNotArchivedException(UUID id) {
        super(HttpStatus.CONFLICT, "Este projeto não está arquivado");
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/ProjectNotFoundException.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

import java.util.UUID;

public class ProjectNotFoundException extends ApiException {

    public ProjectNotFoundException(UUID id) {
        super(HttpStatus.NOT_FOUND, "Projeto não encontrado");
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/models/ProjectName.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.models;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.Size;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Size(min = 3, max = 100, message = "O nome do projeto deve ter entre 3 e 100 caracteres")
@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = {})
public @interface ProjectName {
    String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/commands/add_member/AddMember.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.add_member;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject.projects.domain.enums.ProjectRole;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.InsufficientPermissionException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.MemberAlreadyExistsException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.ProjectNotFoundException;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectMemberRepository;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class AddMember implements IAddMember {

    private final IProjectRepository projectRepository;
    private final IProjectMemberRepository memberRepository;

    public AddMember(IProjectRepository projectRepository, IProjectMemberRepository memberRepository) {
        this.projectRepository = projectRepository;
        this.memberRepository = memberRepository;
    }

    @Override
    public AddMemberOutput execute(UUID projectId, AddMemberInput input) {
        final var requesterId = UserLogged.id();

        final var project = projectRepository.findById(projectId, requesterId)
                .orElseThrow(() -> new ProjectNotFoundException(projectId));

        if (!ProjectRole.valueOf(project.role()).canEdit()) {
            throw new InsufficientPermissionException();
        }

        if (memberRepository.exists(projectId, input.userId())) {
            throw new MemberAlreadyExistsException(projectId, input.userId());
        }

        memberRepository.persist(projectId, input.userId(), input.role());
        return new AddMemberOutput(projectId, input.userId());
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/commands/add_member/IAddMember.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.add_member;

import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface IAddMember {

    AddMemberOutput execute(UUID projectId, @Valid AddMemberInput input);

    record AddMemberInput(UUID userId, String role) {
    }

    record AddMemberOutput(UUID projectId, UUID userId) {
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/commands/archive_project/ArchiveProject.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.archive_project;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject.projects.domain.enums.ProjectRole;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.InsufficientPermissionException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.ProjectAlreadyArchivedException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.ProjectNotFoundException;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
public class ArchiveProject implements IArchiveProject {

    private final IProjectRepository repository;

    public ArchiveProject(IProjectRepository repository) {
        this.repository = repository;

    }

    @Override
    @Transactional
    public ArchiveProjectOutput execute(UUID projectId) {
        final var userId = UserLogged.id();

        final var project = repository.findById(projectId, userId)
                .orElseThrow(() -> new ProjectNotFoundException(projectId));

        if (project.archivedAt() != null) {
            throw new ProjectAlreadyArchivedException(projectId);
        }

        if (!ProjectRole.valueOf(project.role()).canEdit()) {
            throw new InsufficientPermissionException();
        }

        repository.archive(projectId);
        repository.archiveBoardsByProjectId(projectId);
        repository.archiveTaskGroupsByProjectId(projectId);
        repository.archiveTasksByProjectId(projectId);

        return new ArchiveProjectOutput(projectId, LocalDateTime.now());
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/commands/archive_project/IArchiveProject.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.archive_project;

import java.time.LocalDateTime;
import java.util.UUID;

public interface IArchiveProject {

    ArchiveProjectOutput execute(UUID projectId);

    record ArchiveProjectOutput(UUID id, LocalDateTime archivedAt) {
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/commands/create_project/CreateProject.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectMemberRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class CreateProject implements ICreateProject {

    private final IProjectRepository repository;
    private final IProjectMemberRepository memberRepository;

    public CreateProject(IProjectRepository repository, IProjectMemberRepository memberRepository) {
        this.repository = repository;
        this.memberRepository = memberRepository;
    }

    @Override
    @Transactional
    public CreateProjectOutput execute(CreateProjectInput input) {
        final var ownerId = UserLogged.id();
        final var id = repository.persist(ownerId, input);
        memberRepository.persist(id, ownerId, "OWNER");
        return new CreateProjectOutput(id);
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/commands/create_project/ICreateProject.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project;

import br.edu.ifce.mn.ads.ifproject.projects.domain.models.ProjectName;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface ICreateProject {

    CreateProjectOutput execute(@Valid ICreateProject.CreateProjectInput input);

    record CreateProjectInput(
            @ProjectName String name
    ) {
    }

    record CreateProjectOutput(
            UUID id
    ) {
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/commands/delete_project/DeleteProject.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.delete_project;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject.projects.domain.enums.ProjectRole;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.InsufficientPermissionException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.ProjectNotFoundException;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class DeleteProject implements IDeleteProject {

    private final IProjectRepository repository;

    public DeleteProject(IProjectRepository repository) {
        this.repository = repository;

    }

    @Override
    public DeleteProjectOutput execute(UUID projectId) {
        final var userId = UserLogged.id();

        final var project = repository.findById(projectId, userId)
                .orElseThrow(() -> new ProjectNotFoundException(projectId));

        if (!ProjectRole.valueOf(project.role()).canEdit()) {
            throw new InsufficientPermissionException();
        }

        repository.delete(projectId);
        return new DeleteProjectOutput(projectId);
    }
}
```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/commands/delete_project/IDeleteProject.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.delete_project;

import java.util.UUID;

public interface IDeleteProject {

    DeleteProjectOutput execute(UUID projectId);

    record DeleteProjectOutput(UUID id) {
    }
}
```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/commands/remove_member/IRemoveMember.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.remove_member;

import java.util.UUID;

public interface IRemoveMember {

    RemoveMemberOutput execute(UUID projectId, UUID targetUserId);

    record RemoveMemberOutput(UUID projectId, UUID userId) {
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/commands/remove_member/RemoveMember.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.remove_member;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject.projects.domain.enums.ProjectRole;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.CannotRemoveOwnerException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.InsufficientPermissionException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.MemberNotFoundException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.ProjectNotFoundException;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectMemberRepository;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RemoveMember implements IRemoveMember {

    private final IProjectRepository projectRepository;
    private final IProjectMemberRepository memberRepository;

    public RemoveMember(IProjectRepository projectRepository, IProjectMemberRepository memberRepository) {
        this.projectRepository = projectRepository;
        this.memberRepository = memberRepository;
    }

    @Override
    public RemoveMemberOutput execute(UUID projectId, UUID targetUserId) {
        final var requesterId = UserLogged.id();

        final var project = projectRepository.findById(projectId, requesterId)
                .orElseThrow(() -> new ProjectNotFoundException(projectId));

        if (!ProjectRole.valueOf(project.role()).canEdit()) {
            throw new InsufficientPermissionException();
        }

        if (targetUserId.equals(project.ownerId())) {
            throw new CannotRemoveOwnerException();
        }

        if (!memberRepository.exists(projectId, targetUserId)) {
            throw new MemberNotFoundException(targetUserId);
        }

        memberRepository.delete(projectId, targetUserId);
        return new RemoveMemberOutput(projectId, targetUserId);
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/commands/restore_project/IRestoreProject.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.restore_project;

import java.util.UUID;

public interface IRestoreProject {

    RestoreProjectOutput execute(UUID projectId);

    record RestoreProjectOutput(UUID id) {
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/commands/restore_project/RestoreProject.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.restore_project;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject.projects.domain.enums.ProjectRole;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.InsufficientPermissionException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.ProjectNotArchivedException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.ProjectNotFoundException;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Component
public class RestoreProject implements IRestoreProject {

    private final IProjectRepository repository;

    public RestoreProject(IProjectRepository repository) {
        this.repository = repository;

    }

    @Override
    @Transactional
    public RestoreProjectOutput execute(UUID projectId) {
        final var userId = UserLogged.id();

        final var project = repository.findById(projectId, userId)
                .orElseThrow(() -> new ProjectNotFoundException(projectId));

        if (project.archivedAt() == null) {
            throw new ProjectNotArchivedException(projectId);
        }

        if (!ProjectRole.valueOf(project.role()).canEdit()) {
            throw new InsufficientPermissionException();
        }

        repository.restore(projectId);
        repository.restoreBoardsByProjectId(projectId);
        repository.restoreTaskGroupsByProjectId(projectId);
        repository.restoreTasksByProjectId(projectId);

        return new RestoreProjectOutput(projectId);
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/commands/transfer_ownership/ITransferOwnership.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.transfer_ownership;

import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface ITransferOwnership {

    TransferOwnershipOutput execute(UUID projectId, @Valid TransferOwnershipInput input);

    record TransferOwnershipInput(UUID newOwnerId) {
    }

    record TransferOwnershipOutput(UUID projectId, UUID newOwnerId) {
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/commands/transfer_ownership/TransferOwnership.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.transfer_ownership;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject.projects.domain.enums.ProjectRole;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.CannotTransferToNonMemberException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.InsufficientPermissionException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.ProjectNotFoundException;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectMemberRepository;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Component
public class TransferOwnership implements ITransferOwnership {

    private final IProjectRepository projectRepository;
    private final IProjectMemberRepository memberRepository;

    public TransferOwnership(IProjectRepository projectRepository, IProjectMemberRepository memberRepository) {
        this.projectRepository = projectRepository;
        this.memberRepository = memberRepository;
    }

    @Override
    @Transactional
    public TransferOwnershipOutput execute(UUID projectId, TransferOwnershipInput input) {
        final var currentUserId = UserLogged.id();

        final var project = projectRepository.findById(projectId, currentUserId)
                .orElseThrow(() -> new ProjectNotFoundException(projectId));

        if (!ProjectRole.valueOf(project.role()).isOwner()) {
            throw new InsufficientPermissionException();
        }

        if (currentUserId.equals(input.newOwnerId())) {
            return new TransferOwnershipOutput(projectId, input.newOwnerId());
        }

        if (!memberRepository.exists(projectId, input.newOwnerId())) {
            throw new CannotTransferToNonMemberException(input.newOwnerId());
        }

        projectRepository.transferOwnership(projectId, input.newOwnerId());

        memberRepository.updateRole(projectId, input.newOwnerId(), ProjectRole.ADMIN.name());

        return new TransferOwnershipOutput(projectId, input.newOwnerId());
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/commands/update_member_role/IUpdateMemberRole.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_member_role;

import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface IUpdateMemberRole {

    UpdateMemberRoleOutput execute(UUID projectId, UUID targetUserId, @Valid UpdateMemberRoleInput input);

    record UpdateMemberRoleInput(String role) {
    }

    record UpdateMemberRoleOutput(UUID projectId, UUID userId) {
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/commands/update_member_role/UpdateMemberRole.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_member_role;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject.projects.domain.enums.ProjectRole;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.InsufficientPermissionException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.MemberNotFoundException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.ProjectNotFoundException;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectMemberRepository;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UpdateMemberRole implements IUpdateMemberRole {

    private final IProjectRepository projectRepository;
    private final IProjectMemberRepository memberRepository;

    public UpdateMemberRole(IProjectRepository projectRepository, IProjectMemberRepository memberRepository) {
        this.projectRepository = projectRepository;
        this.memberRepository = memberRepository;
    }

    @Override
    public UpdateMemberRoleOutput execute(UUID projectId, UUID targetUserId, UpdateMemberRoleInput input) {
        final var requesterId = UserLogged.id();

        final var project = projectRepository.findById(projectId, requesterId)
                .orElseThrow(() -> new ProjectNotFoundException(projectId));

        if (!ProjectRole.valueOf(project.role()).canEdit()) {
            throw new InsufficientPermissionException();
        }

        if (!memberRepository.exists(projectId, targetUserId)) {
            throw new MemberNotFoundException(targetUserId);
        }

        memberRepository.updateRole(projectId, targetUserId, input.role());
        return new UpdateMemberRoleOutput(projectId, targetUserId);
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/commands/update_project/IUpdateProject.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_project;


import br.edu.ifce.mn.ads.ifproject.projects.domain.models.ProjectName;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface IUpdateProject {

    UpdateProjectOutput execute(UUID projectId, @Valid UpdateProjectInput input);

    record UpdateProjectInput (
            @ProjectName String name
    ){}

    record UpdateProjectOutput(
            UUID projectId
    ){}
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/commands/update_project/UpdateProject.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_project;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject.projects.domain.enums.ProjectRole;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.InsufficientPermissionException;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.ProjectNotFoundException;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
public class UpdateProject implements IUpdateProject {

    private final IProjectRepository repository;

    public UpdateProject(IProjectRepository repository) {
        this.repository = repository;

    }

    @Override
    public UpdateProjectOutput execute(UUID projectId, UpdateProjectInput input) {
        final var usrId = UserLogged.id();
        final var project = repository.findById(projectId, usrId)
                .orElseThrow(() -> new ProjectNotFoundException(projectId));

        if (!ProjectRole.valueOf(project.role()).canEdit()) {
            throw new InsufficientPermissionException();
        }

        repository.update(projectId, input);
        return new UpdateProjectOutput(projectId);
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/queries/find_project/FindProjectByIdAndUserId.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.find_project;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.ProjectNotFoundException;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
public class FindProjectByIdAndUserId implements IFindProjectByIdAndUserId {

    private final IProjectRepository repository;

    public FindProjectByIdAndUserId(IProjectRepository repository) {
        this.repository = repository;

    }

    @Override
    public IProjectRepository.FindProjectOutput execute(UUID projectId) {

        final var userId = UserLogged.id();
        return repository.findById(projectId, userId).orElseThrow(() -> new ProjectNotFoundException(projectId));

        // TODO: RI8 — verificar se requester é membro quando P2 entregar IProjectMemberRepository
        // memberRepository.findRole(projectId, requesterId)
        //         .orElseThrow(() -> new InsufficientPermissionException());

//        return repository.findById(projectId)
//                .orElseThrow(() -> new ProjectNotFoundException(projectId));

       // throw new UnsupportedOperationException("RI8 — implementar FindProjectByIdAndUserId quando P2 entregar IProjectMemberRepository");
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/queries/find_project/IFindProjectByIdAndUserId.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.find_project;


import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;

import java.util.UUID;

public interface IFindProjectByIdAndUserId {

    IProjectRepository.FindProjectOutput execute(UUID projectId);

}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/queries/list_archived_projects/IListArchivedProjects.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.list_archived_projects;

import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Validated
public interface IListArchivedProjects {

    List<IListArchivedProjectsOutput> execute(Pageable pageable);

    record ListArchivedProjectsInput(UUID userId, Pageable pageable) {
    }

    record IListArchivedProjectsOutput(UUID id, String name, LocalDateTime archivedAt) {
    }


}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/queries/list_archived_projects/ListArchivedProjects.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.list_archived_projects;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class ListArchivedProjects implements IListArchivedProjects {

    private final IProjectRepository projectRepository;

    public ListArchivedProjects(IProjectRepository projectRepository) {
        this.projectRepository = projectRepository;

    }

    @Override
    public List<IListArchivedProjectsOutput> execute(Pageable pageable) {
        var input = new ListArchivedProjectsInput(UserLogged.id(), pageable);
        return projectRepository.findArchivedByUser(input, pageable);
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/queries/list_members/IListMembers.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.list_members;

import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectMemberRepository;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface IListMembers {

    List<IProjectMemberRepository.ListMembersOutput> execute(UUID projectId, Pageable pageable);
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/queries/list_members/ListMembers.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.list_members;

import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectMemberRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class ListMembers implements IListMembers {

    private final IProjectMemberRepository memberRepository;

    public ListMembers(IProjectMemberRepository memberRepository) {
        this.memberRepository = memberRepository;

    }

    @Override
    public List<IProjectMemberRepository.ListMembersOutput> execute(UUID projectId, Pageable pageable) {
        return memberRepository.findAllByProjectId(projectId, pageable);
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/queries/list_projects/IListProjects.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.list_projects;

import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IListProjects {

    List<IProjectRepository.ListProjectsOutput> execute(Pageable pageable);
}
```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/queries/list_projects/ListProjects.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.list_projects;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListProjects implements IListProjects {

    private final IProjectRepository repository;

    public ListProjects(IProjectRepository repository) {
        this.repository = repository;

    }

    @Override
    public List<IProjectRepository.ListProjectsOutput> execute(Pageable pageable) {
        final var userId = UserLogged.id();
        return repository.findAllByUserId(userId, pageable);
    }
}
```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/infra/repositories/IProjectMemberRepository.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories;

import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IProjectMemberRepository {

    void persist(UUID projectId, UUID userId, String role);

    void delete(UUID projectId, UUID userId);

    boolean exists(UUID projectId, UUID userId);

    void updateRole(UUID projectId, UUID userId, String role);

    List<ListMembersOutput> findAllByProjectId(UUID projectId, Pageable pageable);

    Optional<String> findRole(UUID projectId, UUID userId);

    record ListMembersOutput(
            UUID userId,
            String username,
            String email,
            String role,
            LocalDateTime joinedAt
    ) {
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/infra/repositories/IProjectRepository.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project.ICreateProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_project.IUpdateProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.list_archived_projects.IListArchivedProjects;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IProjectRepository {

    UUID persist(UUID ownerId, ICreateProject.CreateProjectInput input);

    void update(UUID id, IUpdateProject.UpdateProjectInput input);

    void delete(UUID id);

    Optional<FindProjectOutput> findById(UUID id, UUID userId);

    List<IListArchivedProjects.IListArchivedProjectsOutput> findArchivedByUser(
            IListArchivedProjects.ListArchivedProjectsInput input, Pageable pageable
    );

    record FindProjectOutput(
            UUID projectId,
            String name,
            UUID ownerId,
            String role,
            LocalDateTime createdAt,
            LocalDateTime archivedAt
    ) {
    }

    void archive(UUID id);

    void restore(UUID id);

    void archiveBoardsByProjectId(UUID projectId);

    void archiveTaskGroupsByProjectId(UUID projectId);

    void archiveTasksByProjectId(UUID projectId);

    void restoreBoardsByProjectId(UUID projectId);

    void restoreTaskGroupsByProjectId(UUID projectId);

    void restoreTasksByProjectId(UUID projectId);

    List<ListProjectsOutput> findAllByUserId(UUID userId, Pageable pageable);

    UUID findOwnerId(UUID projectId);

    void transferOwnership(UUID projectId, UUID newOwnerId);

    record ListProjectsOutput(
            UUID id,
            String name,
            UUID ownerId,
            LocalDateTime createdAt) {
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/infra/repositories/ProjectMemberRepository.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql.*;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class ProjectMemberRepository implements IProjectMemberRepository {

    private final PersistMemberSQL persistMemberSQL;
    private final DeleteMemberSQL deleteMemberSQL;
    private final ExistsMemberSQL existsMemberSQL;
    private final UpdateMemberRoleSQL updateMemberRoleSQL;
    private final ListMembersSQL listMembersSQL;
    private final FindMemberRoleSQL findMemberRoleSQL;

    public ProjectMemberRepository(
            PersistMemberSQL persistMemberSQL,
            DeleteMemberSQL deleteMemberSQL,
            ExistsMemberSQL existsMemberSQL,
            UpdateMemberRoleSQL updateMemberRoleSQL,
            ListMembersSQL listMembersSQL,
            FindMemberRoleSQL findMemberRoleSQL
    ) {
        this.persistMemberSQL = persistMemberSQL;
        this.deleteMemberSQL = deleteMemberSQL;
        this.existsMemberSQL = existsMemberSQL;
        this.updateMemberRoleSQL = updateMemberRoleSQL;
        this.listMembersSQL = listMembersSQL;
        this.findMemberRoleSQL = findMemberRoleSQL;
    }

    @Override
    public void persist(UUID projectId, UUID userId, String role) {
        persistMemberSQL.execute(projectId, userId, role);

    }

    @Override
    public void delete(UUID projectId, UUID userId) {
        deleteMemberSQL.execute(projectId, userId);

    }

    @Override
    public boolean exists(UUID projectId, UUID userId) {
        return existsMemberSQL.execute(projectId, userId);

    }

    @Override
    public void updateRole(UUID projectId, UUID userId, String role) {
        updateMemberRoleSQL.execute(projectId, userId, role);
    }

    @Override
    public List<ListMembersOutput> findAllByProjectId(UUID projectId, Pageable pageable) {
        return listMembersSQL.execute(projectId, pageable);
    }

    @Override
    public Optional<String> findRole(UUID projectId, UUID userId) {
        return findMemberRoleSQL.execute(projectId, userId);
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/infra/repositories/ProjectRepository.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project.ICreateProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_project.IUpdateProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.list_archived_projects.IListArchivedProjects;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql.*;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class ProjectRepository implements IProjectRepository {

    private final ListArchivedProjectsSQL listArchivedProjectsSQL;
    private final CreateProjectSQL createProjectSQL;
    private final UpdateProjectSQL updateProjectSQL;
    private final DeleteProjectSQL deleteProjectSQL;
    private final FindProjectSQL findProjectSQL;
    private final ListProjectsSQL listProjectsSQL;
    private final ArchiveProjectSQL archiveProjectSQL;
    private final RestoreProjectSQL restoreProjectSQL;
    private final ArchiveBoardsSQL archiveBoardsSQL;
    private final ArchiveTaskGroupsSQL archiveTaskGroupsSQL;
    private final ArchiveTasksSQL archiveTasksSQL;
    private final RestoreBoardsSQL restoreBoardsSQL;
    private final RestoreTaskGroupsSQL restoreTaskGroupsSQL;
    private final RestoreTasksSQL restoreTasksSQL;
    private final FindOwnerIdSQL findOwnerIdSQL;
    private final TransferOwnershipSQL transferOwnershipSQL;

    public ProjectRepository(UpdateProjectSQL updateProjectSQL,
                             CreateProjectSQL createProjectSQL,
                             ListArchivedProjectsSQL listArchivedProjectsSQL,
                             FindProjectSQL findProjectSQL, DeleteProjectSQL deleteProjectSQL,
                             ListProjectsSQL listProjectsSQL,
                             ArchiveProjectSQL archiveProjectSQL,
                             RestoreProjectSQL restoreProjectSQL,
                             ArchiveBoardsSQL archiveBoardsSQL,
                             ArchiveTaskGroupsSQL archiveTaskGroupsSQL,
                             ArchiveTasksSQL archiveTasksSQL,
                             RestoreBoardsSQL restoreBoardsSQL,
                             RestoreTaskGroupsSQL restoreTaskGroupsSQL,
                             RestoreTasksSQL restoreTasksSQL,
                             FindOwnerIdSQL findOwnerIdSQL,
                             TransferOwnershipSQL transferOwnershipSQL
                             ) {
        this.listArchivedProjectsSQL = listArchivedProjectsSQL;
        this.createProjectSQL = createProjectSQL;
        this.updateProjectSQL = updateProjectSQL;
        this.deleteProjectSQL = deleteProjectSQL;
        this.findProjectSQL = findProjectSQL;
        this.listProjectsSQL = listProjectsSQL;
        this.archiveProjectSQL = archiveProjectSQL;
        this.restoreProjectSQL = restoreProjectSQL;
        this.archiveBoardsSQL = archiveBoardsSQL;
        this.archiveTaskGroupsSQL = archiveTaskGroupsSQL;
        this.archiveTasksSQL = archiveTasksSQL;
        this.restoreBoardsSQL = restoreBoardsSQL;
        this.restoreTaskGroupsSQL = restoreTaskGroupsSQL;
        this.restoreTasksSQL = restoreTasksSQL;
        this.findOwnerIdSQL = findOwnerIdSQL;
        this.transferOwnershipSQL = transferOwnershipSQL;

    }

    @Override
    public UUID persist(UUID ownerId, ICreateProject.CreateProjectInput input){
        return createProjectSQL.execute(ownerId, input);
    }

    @Override
    public void update(UUID id, IUpdateProject.UpdateProjectInput input) {
        updateProjectSQL.execute(id, input);

    }

    public void delete(UUID id){
        deleteProjectSQL.execute(id);
    }

    @Override
    public Optional<FindProjectOutput> findById(UUID id, UUID userId) {
        return findProjectSQL.execute(id, userId);

    }

    @Override
    public List<IListArchivedProjects.IListArchivedProjectsOutput> findArchivedByUser(
            IListArchivedProjects.ListArchivedProjectsInput input, Pageable pageable
    ) {
        return listArchivedProjectsSQL.execute(input, pageable);
    }

    @Override
    public void archive(UUID id) {
        archiveProjectSQL.execute(id);

    }

    @Override
    public void restore(UUID id) {
        restoreProjectSQL.execute(id);

    }

    @Override
    public void archiveBoardsByProjectId(UUID projectId) {
        archiveBoardsSQL.execute(projectId);

    }

    @Override
    public void archiveTaskGroupsByProjectId(UUID projectId) {
        archiveTaskGroupsSQL.execute(projectId);

    }

    @Override
    public void archiveTasksByProjectId(UUID projectId) {
        archiveTasksSQL.execute(projectId);

    }

    @Override
    public void restoreBoardsByProjectId(UUID projectId) {
        restoreBoardsSQL.execute(projectId);

    }

    @Override
    public void restoreTaskGroupsByProjectId(UUID projectId) {
        restoreTaskGroupsSQL.execute(projectId);

    }

    @Override
    public void restoreTasksByProjectId(UUID projectId) {
        restoreTasksSQL.execute(projectId);

    }

    @Override
    public List<ListProjectsOutput> findAllByUserId(UUID userId, Pageable pageable) {
        return listProjectsSQL.execute(userId, pageable);
    }

    @Override
    public UUID findOwnerId(UUID projectId) {
        return findOwnerIdSQL.execute(projectId);

    }

    @Override
    public void transferOwnership(UUID projectId, UUID newOwnerId) {
        transferOwnershipSQL.execute(projectId, newOwnerId);
    }

}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/infra/repositories/sql/ArchiveBoardsSQL.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ArchiveBoardsSQL {

    private final static String SQL = """
            UPDATE boards SET is_archived = true WHERE project_id = ?
            """;

    private final JdbcClient jdbcClient;

    public ArchiveBoardsSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public void execute(UUID projectId) {
        jdbcClient.sql(SQL)
                .param(projectId)
                .update();
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/infra/repositories/sql/ArchiveProjectSQL.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ArchiveProjectSQL {

    private final static String SQL = """
            UPDATE projects SET archived_at = CURRENT_TIMESTAMP WHERE id = ?
            """;

    private final JdbcClient jdbcClient;

    public ArchiveProjectSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public void execute(UUID id) {
        jdbcClient.sql(SQL)
                .param(id)
                .update();
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/infra/repositories/sql/ArchiveTaskGroupsSQL.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ArchiveTaskGroupsSQL {

    private final static String SQL = """
            UPDATE task_groups SET is_archived = true
            WHERE board_id IN (SELECT id FROM boards WHERE project_id = ?)
            """;

    private final JdbcClient jdbcClient;

    public ArchiveTaskGroupsSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public void execute(UUID projectId) {
        jdbcClient.sql(SQL)
                .param(projectId)
                .update();
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/infra/repositories/sql/ArchiveTasksSQL.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ArchiveTasksSQL {

    private final static String SQL = """
            UPDATE tasks SET is_archived = true
            WHERE task_group_id IN (
                SELECT tg.id FROM task_groups tg
                    JOIN boards b ON tg.board_id = b.id
                WHERE b.project_id = ?
            )
            """;

    private final JdbcClient jdbcClient;

    public ArchiveTasksSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public void execute(UUID projectId) {
        jdbcClient.sql(SQL)
                .param(projectId)
                .update();
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/infra/repositories/sql/CreateProjectSQL.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project.ICreateProject;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CreateProjectSQL {

    private final static String SQL = """
            INSERT INTO projects(name, owner_id) VALUES (?, ?)
            RETURNING id
            """;

    private final JdbcClient jdbcClient;

    public CreateProjectSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public UUID execute(UUID ownerId, ICreateProject.CreateProjectInput input) {
        return jdbcClient.sql(SQL)
                .param(input.name())
                .param(ownerId)
                .query(UUID.class)
                .single();
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/infra/repositories/sql/DeleteMemberSQL.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class DeleteMemberSQL {

    private final static String SQL = """
            DELETE FROM project_members WHERE project_id = ? AND user_id = ?
            """;

    private final JdbcClient jdbcClient;

    public DeleteMemberSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public void execute(UUID projectId, UUID userId) {
        jdbcClient.sql(SQL)
                .param(projectId)
                .param(userId)
                .update();
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/infra/repositories/sql/DeleteProjectSQL.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class DeleteProjectSQL {

    private final static String SQL = """
            DELETE FROM projects WHERE id = ?
            """;

    private final JdbcClient jdbcClient;

    public DeleteProjectSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public void execute(UUID id) {
        jdbcClient.sql(SQL)
                .param(id)
                .update();
    }
}
```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/infra/repositories/sql/ExistsMemberSQL.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ExistsMemberSQL {

    private final static String SQL = """
            SELECT EXISTS(SELECT 1 FROM project_members WHERE project_id = ? AND user_id = ?)
            """;

    private final JdbcClient jdbcClient;

    public ExistsMemberSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public boolean execute(UUID projectId, UUID userId) {
        return jdbcClient.sql(SQL)
                .param(projectId)
                .param(userId)
                .query(Boolean.class)
                .single();
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/infra/repositories/sql/FindMemberRoleSQL.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class FindMemberRoleSQL {

    private final static String SQL = """
            SELECT role FROM project_members WHERE project_id = ? AND user_id = ?
            """;

    private final JdbcClient jdbcClient;

    public FindMemberRoleSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public Optional<String> execute(UUID projectId, UUID userId) {
        return jdbcClient.sql(SQL)
                .param(projectId)
                .param(userId)
                .query(String.class)
                .optional();
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/infra/repositories/sql/FindOwnerIdSQL.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class FindOwnerIdSQL {

    private final static String SQL = """
            SELECT owner_id FROM projects WHERE id = ?
            """;

    private final JdbcClient jdbcClient;

    public FindOwnerIdSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public UUID execute(UUID projectId) {
        return jdbcClient.sql(SQL)
                .param(projectId)
                .query(UUID.class)
                .single();
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/infra/repositories/sql/FindProjectSQL.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import br.edu.ifce.mn.ads.ifproject.projects.domain.enums.ProjectRole;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class FindProjectSQL {

    private final JdbcClient jdbcClient;

    public FindProjectSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public Optional<IProjectRepository.FindProjectOutput> execute(UUID id, UUID userId) {
        final var SQL = """
                SELECT id, name, owner_id, role, created_at, archived_at
                FROM projects p 
                    LEFT JOIN project_members pm ON p.id = pm.project_id AND user_id = ?
                WHERE id = ? 
                    AND (p.owner_id = ? OR pm.user_id IS NOT NULL)
                """;
        return jdbcClient.sql(SQL)
                .param(userId)
                .param(id)
                .param(userId)
                .query((rs, _) -> {
                    var role = rs.getString("role");
                    final var ownerId = rs.getObject("owner_id", UUID.class);
                    if(ownerId.equals(userId)) {
                        role = ProjectRole.OWNER.name();
                    }
                    return new IProjectRepository.FindProjectOutput(
                            rs.getObject("id", UUID.class),
                            rs.getString("name"),
                            rs.getObject("owner_id", UUID.class),
                            role,
                            rs.getTimestamp("created_at").toLocalDateTime(),
                            rs.getTimestamp("archived_at") != null
                                    ? rs.getTimestamp("archived_at").toLocalDateTime()
                                    : null
                    );
                })
                .optional();
    }
}
```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/infra/repositories/sql/ListArchivedProjectsSQL.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.list_archived_projects.IListArchivedProjects;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListArchivedProjectsSQL {

    private final static String SQL = """
            SELECT p.id, p.name, p.archived_at as archivedAt
            FROM projects p
            WHERE p.owner_id = ?
            AND p.archived_at IS NOT NULL
            ORDER BY p.archived_at DESC, p.id DESC
            LIMIT ? OFFSET ?
            """;

    private final JdbcClient jdbcClient;

    public ListArchivedProjectsSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public List<IListArchivedProjects.IListArchivedProjectsOutput> execute(
            IListArchivedProjects.ListArchivedProjectsInput input, Pageable pageable
    ) {


        return jdbcClient.sql(SQL)
                .param(input.userId())
                .param(pageable.getPageSize())
                .param(pageable.getOffset())
                .query(IListArchivedProjects.IListArchivedProjectsOutput.class)
                .list();
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/infra/repositories/sql/ListMembersSQL.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectMemberRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class ListMembersSQL {

    private final static String SQL = """
            SELECT pm.user_id, u.username, u.email, pm.role, pm.joined_at
            FROM project_members pm
                JOIN users u ON pm.user_id = u.id
            WHERE pm.project_id = ?
            ORDER BY pm.joined_at ASC
            LIMIT ? OFFSET ?
            """;

    private final JdbcClient jdbcClient;

    public ListMembersSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public List<IProjectMemberRepository.ListMembersOutput> execute(UUID projectId, Pageable pageable) {
        return jdbcClient.sql(SQL)
                .param(projectId)
                .param(pageable.getPageSize())
                .param(pageable.getOffset())
                .query(IProjectMemberRepository.ListMembersOutput.class)
                .list();
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/infra/repositories/sql/ListProjectsSQL.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class ListProjectsSQL {

    private final static String SQL = """
            SELECT p.id, p.name, p.owner_id, p.created_at
            FROM projects p
                JOIN project_members pm ON p.id = pm.project_id
            WHERE pm.user_id = ? AND p.archived_at IS NULL
            ORDER BY p.created_at DESC
            LIMIT ? OFFSET ?
            """;

    private final JdbcClient jdbcClient;

    public ListProjectsSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public List<IProjectRepository.ListProjectsOutput> execute(UUID userId, Pageable pageable) {
        return jdbcClient.sql(SQL)
                .param(userId)
                .param(pageable.getPageSize())
                .param(pageable.getOffset())
                .query(IProjectRepository.ListProjectsOutput.class)
                .list();
    }
}
```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/infra/repositories/sql/PersistMemberSQL.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class PersistMemberSQL {

    private final static String SQL = """
            INSERT INTO project_members(project_id, user_id, role) VALUES (?, ?, ?)
            """;

    private final JdbcClient jdbcClient;

    public PersistMemberSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public void execute(UUID projectId, UUID userId, String role) {
        jdbcClient.sql(SQL)
                .param(projectId)
                .param(userId)
                .param(role)
                .update();
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/infra/repositories/sql/RestoreBoardsSQL.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RestoreBoardsSQL {

    private final static String SQL = """
            UPDATE boards SET is_archived = false WHERE project_id = ?
            """;

    private final JdbcClient jdbcClient;

    public RestoreBoardsSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public void execute(UUID projectId) {
        jdbcClient.sql(SQL)
                .param(projectId)
                .update();
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/infra/repositories/sql/RestoreProjectSQL.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RestoreProjectSQL {

    private final static String SQL = """
            UPDATE projects SET archived_at = NULL WHERE id = ?
            """;

    private final JdbcClient jdbcClient;

    public RestoreProjectSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public void execute(UUID id) {
        jdbcClient.sql(SQL)
                .param(id)
                .update();
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/infra/repositories/sql/RestoreTaskGroupsSQL.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RestoreTaskGroupsSQL {

    private final static String SQL = """
            UPDATE task_groups SET is_archived = false
            WHERE board_id IN (SELECT id FROM boards WHERE project_id = ?)
            """;

    private final JdbcClient jdbcClient;

    public RestoreTaskGroupsSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public void execute(UUID projectId) {
        jdbcClient.sql(SQL)
                .param(projectId)
                .update();
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/infra/repositories/sql/RestoreTasksSQL.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RestoreTasksSQL {

    private final static String SQL = """
            UPDATE tasks SET is_archived = false
            WHERE task_group_id IN (
                SELECT tg.id FROM task_groups tg
                    JOIN boards b ON tg.board_id = b.id
                WHERE b.project_id = ?
            )
            """;

    private final JdbcClient jdbcClient;

    public RestoreTasksSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public void execute(UUID projectId) {
        jdbcClient.sql(SQL)
                .param(projectId)
                .update();
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/infra/repositories/sql/TransferOwnershipSQL.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TransferOwnershipSQL {

    private final static String SQL = """
            UPDATE projects SET owner_id = ? WHERE id = ?
            """;

    private final JdbcClient jdbcClient;

    public TransferOwnershipSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public void execute(UUID projectId, UUID newOwnerId) {
        jdbcClient.sql(SQL)
                .param(newOwnerId)
                .param(projectId)
                .update();
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/infra/repositories/sql/UpdateMemberRoleSQL.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UpdateMemberRoleSQL {

    private final static String SQL = """
            UPDATE project_members SET role = ? WHERE project_id = ? AND user_id = ?
            """;

    private final JdbcClient jdbcClient;

    public UpdateMemberRoleSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public void execute(UUID projectId, UUID userId, String role) {
        jdbcClient.sql(SQL)
                .param(role)
                .param(projectId)
                .param(userId)
                .update();
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/projects/infra/repositories/sql/UpdateProjectSQL.java`

```java
package br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.sql;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_project.IUpdateProject;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UpdateProjectSQL {

    private final static String SQL = """
                UPDATE projects SET name = ? WHERE id = ?
                """;

    private final JdbcClient jdbcClient;

    public UpdateProjectSQL(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;

    }

    public void execute(UUID id, IUpdateProject.UpdateProjectInput input) {

        jdbcClient.sql(SQL)
                .param(input.name())
                .param(id)
                .update();

    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/application/controllers/SubtaskController.java`

```java
package br.edu.ifce.mn.ads.ifproject.subtasks.application.controllers;

import br.edu.ifce.mn.ads.ifproject.subtasks.application.dto.CreateSubtaskRequest;
import br.edu.ifce.mn.ads.ifproject.subtasks.application.dto.SubtaskResponse;
import br.edu.ifce.mn.ads.ifproject.subtasks.application.dto.UpdateSubtaskCompletionRequest;
import br.edu.ifce.mn.ads.ifproject.subtasks.application.dto.UpdateSubtaskDescriptionRequest;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usecases.commands.toggle.IToggleSubtask;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion.ConvertToTaskInput;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion.IConversionSubTasks;
import br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories.SubtaskCrudRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/subtasks")
public class SubtaskController {
    private final IToggleSubtask toggleSubtask;
    private final IConversionSubTasks conversionSubTasks;
    private final SubtaskCrudRepository crudRepository;

    public SubtaskController(
            IToggleSubtask toggleSubtask,
            IConversionSubTasks conversionSubTasks,
            SubtaskCrudRepository crudRepository
    ) {
        this.toggleSubtask = toggleSubtask;
        this.conversionSubTasks = conversionSubTasks;
        this.crudRepository = crudRepository;
    }

    @PostMapping
    public ResponseEntity<UUID> create(@RequestBody @Valid CreateSubtaskRequest input) {
        return ResponseEntity.status(HttpStatus.CREATED).body(crudRepository.create(input));
    }

    @GetMapping("/task-groups/{taskId}")
    public List<SubtaskResponse> listByTask(@PathVariable UUID taskId) {
        return crudRepository.findByTaskId(taskId);
    }

    @PatchMapping("/{subtaskId}/description")
    public ResponseEntity<Void> updateDescription(
            @PathVariable UUID subtaskId,
            @RequestBody @Valid UpdateSubtaskDescriptionRequest input
    ) {
        crudRepository.updateDescription(subtaskId, input.description());
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{subtaskId}/completion")
    public ResponseEntity<Void> updateCompletion(
            @PathVariable UUID subtaskId,
            @RequestBody @Valid UpdateSubtaskCompletionRequest input
    ) {
        crudRepository.updateCompletion(subtaskId, input.completed());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{subtaskId}")
    public ResponseEntity<Void> delete(@PathVariable UUID subtaskId) {
        crudRepository.delete(subtaskId);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{subtask_id}/toggle")
    public IToggleSubtask.ToggleSubtaskOutput patch(
            @PathVariable("subtask_id") UUID id
    ) {
        return toggleSubtask.execute(id);
    }

    @PostMapping("/conversion")
    public ResponseEntity<Void> conversionSubtask(@RequestBody @Valid ConvertToTaskInput input) {
        conversionSubTasks.execute(input);
        return ResponseEntity.noContent().build();
    }

}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/application/dto/CreateSubtaskRequest.java`

```java
package br.edu.ifce.mn.ads.ifproject.subtasks.application.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record CreateSubtaskRequest(
        @NotNull UUID taskId,
        @NotBlank String description,
        @NotNull @Min(0) Integer position
) {
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/application/dto/SubtaskResponse.java`

```java
package br.edu.ifce.mn.ads.ifproject.subtasks.application.dto;

import java.time.OffsetDateTime;
import java.util.UUID;

public record SubtaskResponse(
        UUID id,
        UUID taskId,
        String description,
        int position,
        boolean completed,
        OffsetDateTime createdAt
) {
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/application/dto/UpdateSubtaskCompletionRequest.java`

```java
package br.edu.ifce.mn.ads.ifproject.subtasks.application.dto;

import jakarta.validation.constraints.NotNull;

public record UpdateSubtaskCompletionRequest(@NotNull Boolean completed) {
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/application/dto/UpdateSubtaskDescriptionRequest.java`

```java
package br.edu.ifce.mn.ads.ifproject.subtasks.application.dto;

import jakarta.validation.constraints.NotBlank;

public record UpdateSubtaskDescriptionRequest(@NotBlank String description) {
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/domain/enums/Priority.java`

```java
package br.edu.ifce.mn.ads.ifproject.subtasks.domain.enums;

public enum Priority {

    HIGH, MEDIUM, LOW;

}


```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/domain/exceptions/BusinessRuleException.java`

```java
package br.edu.ifce.mn.ads.ifproject.subtasks.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

public class BusinessRuleException extends ApiException {

    public BusinessRuleException(String message) {
        super(HttpStatus.UNPROCESSABLE_ENTITY, message);
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/domain/exceptions/ResourceNotFoundException.java`

```java
package br.edu.ifce.mn.ads.ifproject.subtasks.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

public class ResourceNotFoundException extends ApiException {

    public ResourceNotFoundException(String message) {
        super(HttpStatus.NOT_FOUND, message);
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/domain/usecases/commands/toggle/IToggleSubtask.java`

```java
package br.edu.ifce.mn.ads.ifproject.subtasks.domain.usecases.commands.toggle;

import java.util.UUID;

public interface IToggleSubtask {
    ToggleSubtaskOutput execute(UUID id);

    record ToggleSubtaskOutput(
            UUID id,
            boolean isCompleted
    ) {
    }
}
```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/domain/usecases/commands/toggle/ToggleSubtask.java`

```java
package br.edu.ifce.mn.ads.ifproject.subtasks.domain.usecases.commands.toggle;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.exceptions.ResourceNotFoundException;
import br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories.ISubtaskRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ToggleSubtask implements IToggleSubtask {
    private final ISubtaskRepository repository;

    public ToggleSubtask(ISubtaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public ToggleSubtaskOutput execute(UUID id) {
        try {
            final var result = repository.toggle(id);
            return new ToggleSubtaskOutput(result.id(), result.isCompleted());
        } catch (EmptyResultDataAccessException ex) {
            throw new ResourceNotFoundException("Subtarefa não encontrada");
        }
    }
}
```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/domain/usercases/commands/conversion/ConversionSubTasks.java`

```java
package br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.exceptions.BusinessRuleException;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.exceptions.ResourceNotFoundException;
import br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories.ISubTasksRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import java.util.UUID;

@Component
public class ConversionSubTasks implements IConversionSubTasks {

    ISubTasksRepository repository;

    public ConversionSubTasks(ISubTasksRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public void execute(ConvertToTaskInput input) {

        UUID subtaskId = input.subtaskId();

        SearchIdOutput searchIdOutput = repository.findParentTaskInfo(subtaskId)
                .orElseThrow(() -> new ResourceNotFoundException("Subtarefa não encontrada"));

        if(repository.isCompletedSubtask(subtaskId)) {
            throw new BusinessRuleException("Não é possível converter uma subtarefa já concluída");
        }

        int positionConvertedSubtask = repository.getPositionConvertedSubtask(subtaskId);

        repository.persistNewTask(new ISubTasksRepository.NewTask(
                searchIdOutput.task_group_id(),
                searchIdOutput.creator_id(),
                searchIdOutput.assignee_id(),
                input.title(),
                input.description(),
                input.priority().name(),
                repository.lastPositionTask(searchIdOutput.task_group_id()) + 1,
                input.dueDate()
        ));

        repository.removeSubtask(subtaskId);

        repository.updatePositionSubtasksAfterConversion(searchIdOutput.task_id(), positionConvertedSubtask);
    }

}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/domain/usercases/commands/conversion/ConvertToTaskInput.java`

```java
package br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.enums.Priority;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.UUID;

public record ConvertToTaskInput(
        @NotNull(message = "Campo não pode ser nulo") UUID subtaskId,
        @NotBlank(message = "Campo título não pode estar vazio") String title,
        @NotBlank(message = "Campo descrição não pode estar vazia") String description,
        @NotNull(message = "Campo priority não pode ser nulo") Priority priority,
        @FutureOrPresent OffsetDateTime dueDate
) {
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/domain/usercases/commands/conversion/IConversionSubTasks.java`

```java
package br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion;

import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.create.ICreateUser;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

public interface IConversionSubTasks {

    public void execute(ConvertToTaskInput input);

}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/domain/usercases/commands/conversion/SearchIdOutput.java`

```java
package br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion;

import java.util.UUID;

public record SearchIdOutput(UUID task_id, UUID assignee_id, UUID creator_id, UUID task_group_id) {
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/infra/repositories/ISubTasksRepository.java`

```java
package br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion.SearchIdOutput;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public interface ISubTasksRepository {

    UUID persistNewTask(NewTask input);

    Optional<SearchIdOutput> findParentTaskInfo(UUID id);

    void removeSubtask(UUID id);

    int lastPositionTask(UUID taskGroupId);

    boolean isCompletedSubtask(UUID id);

    void updatePositionSubtasksAfterConversion(UUID taskId, int position);

    int getPositionConvertedSubtask(UUID id);

    record NewTask(
            UUID taskGroupId,
            UUID creatorId,
            UUID assigneeId,
            String title,
            String description,
            String priority,
            int position,
            OffsetDateTime dueDate
    ) {
    }

}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/infra/repositories/ISubtaskRepository.java`

```java
package br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories;

import java.util.UUID;

public interface ISubtaskRepository {
    SubtaskToggleResult toggle(UUID id);

    record SubtaskToggleResult(UUID id, boolean isCompleted) {}
}
```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/infra/repositories/SubTasksRepository.java`

```java
package br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion.SearchIdOutput;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class SubTasksRepository implements ISubTasksRepository {

    private final JdbcClient db;

    public SubTasksRepository(JdbcClient db) {
        this.db = db;
    }

    @Override
    public UUID persistNewTask(NewTask input) {

        final var SQL = """
                INSERT INTO tasks
                (task_group_id, creator_id, assignee_id, title, description, priority, position, due_date) VALUES (?, ?, ?, ?, ?, ?, ?, ?) RETURNING id
                """;
        return db.sql(SQL).params(input.taskGroupId(), input.creatorId(), input.assigneeId(), input.title(), input.description(), input.priority(), input.position(), input.dueDate()).query(UUID.class).single();

    }

    @Override
    public Optional<SearchIdOutput> findParentTaskInfo(UUID id) {

        final var SQL = """
                SELECT st.task_id, t.task_group_id, t.creator_id, t.assignee_id
                FROM subtasks st JOIN tasks t ON st.task_id = t.id
                WHERE st.id = ?
                """;

        return db.sql(SQL).param(id).query(
                (rs, rowNum) -> {
                return new SearchIdOutput(
                    rs.getObject("task_id", UUID.class),
                    rs.getObject("assignee_id", UUID.class),
                    rs.getObject("creator_id", UUID.class),
                    rs.getObject("task_group_id", UUID.class));}
        ).optional();
    }

    @Override
    public void removeSubtask(UUID id) {

        final var SQL = """
               DELETE FROM subtasks
               WHERE id = ?
               """;

        db.sql(SQL).param(id).update();
    }

    public int lastPositionTask(UUID taskGroupId){

        final var SQL = """
                SELECT COALESCE(MAX(position), -1) FROM tasks WHERE task_group_id = ?
                """;

        return db.sql(SQL).param(taskGroupId).query(Integer.class).single();
    }

    @Override
    public boolean isCompletedSubtask(UUID id){

        final var SQL = """
                SELECT is_completed FROM subtasks WHERE id = ?
                """;
        return db.sql(SQL).param(id).query(Boolean.class).single();

    }

    @Override
    public void updatePositionSubtasksAfterConversion(UUID taskId, int position) {

        final var SQL = """
                UPDATE subtasks SET position = position - 1 WHERE task_id = ? AND position > ?
                """;

        db.sql(SQL).params(taskId, position).update();
    }

    @Override
    public int getPositionConvertedSubtask(UUID id) {

        final var SQL = """
                SELECT position FROM subtasks WHERE id = ?
                """;

        return db.sql(SQL).param(id).query(Integer.class).single();
    }

}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/infra/repositories/SubtaskCrudRepository.java`

```java
package br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.subtasks.application.dto.CreateSubtaskRequest;
import br.edu.ifce.mn.ads.ifproject.subtasks.application.dto.SubtaskResponse;
import br.edu.ifce.mn.ads.ifproject.subtasks.domain.exceptions.ResourceNotFoundException;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Repository
public class SubtaskCrudRepository {

    private final JdbcClient db;

    public SubtaskCrudRepository(JdbcClient db) {
        this.db = db;
    }

    public UUID create(CreateSubtaskRequest input) {
        return db.sql("""
                        INSERT INTO subtasks(task_id, description, position)
                        VALUES (?, ?, ?)
                        RETURNING id
                        """)
                .params(input.taskId(), input.description(), input.position())
                .query(UUID.class)
                .single();
    }

    public List<SubtaskResponse> findByTaskId(UUID taskId) {
        return db.sql("""
                        SELECT id, task_id, description, position, is_completed, created_at
                        FROM subtasks
                        WHERE task_id = ?
                        ORDER BY position, created_at
                        """)
                .param(taskId)
                .query((rs, rowNum) -> new SubtaskResponse(
                        rs.getObject("id", UUID.class),
                        rs.getObject("task_id", UUID.class),
                        rs.getString("description"),
                        rs.getInt("position"),
                        rs.getBoolean("is_completed"),
                        rs.getObject("created_at", OffsetDateTime.class)
                ))
                .list();
    }

    public void updateDescription(UUID id, String description) {
        update("UPDATE subtasks SET description = ? WHERE id = ?", description, id);
    }

    public void updateCompletion(UUID id, boolean completed) {
        update("UPDATE subtasks SET is_completed = ? WHERE id = ?", completed, id);
    }

    public void delete(UUID id) {
        update("DELETE FROM subtasks WHERE id = ?", id);
    }

    private void update(String sql, Object... params) {
        if (db.sql(sql).params(params).update() == 0) {
            throw new ResourceNotFoundException("Subtarefa não encontrada");
        }
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/infra/repositories/SubtaskRepository.java`

```java
package br.edu.ifce.mn.ads.ifproject.subtasks.infra.repositories;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class SubtaskRepository implements ISubtaskRepository {
    private final JdbcTemplate jdbc;

    public SubtaskRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public SubtaskToggleResult toggle(UUID id) {
        final var sql = """
                UPDATE subtasks
                SET is_completed = NOT is_completed
                WHERE id = ?
                RETURNING id, is_completed
                """;

        return jdbc.queryForObject(sql, (rs, rowNum) ->
                new SubtaskToggleResult(
                        UUID.fromString(rs.getString("id")),
                        rs.getBoolean("is_completed")
                ), id);
    }
}
```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task/application/controller/TaskController.java`

```java
package br.edu.ifce.mn.ads.ifproject.task.application.controller;

import br.edu.ifce.mn.ads.ifproject.task.domain.model.Task;
import br.edu.ifce.mn.ads.ifproject.task.domain.usecase.activate.IActivateTask;
import br.edu.ifce.mn.ads.ifproject.task.domain.usecase.archived.IArchivedTask;
import br.edu.ifce.mn.ads.ifproject.task.domain.usecase.create.ICreateTask;
import br.edu.ifce.mn.ads.ifproject.task.domain.usecase.update.IUpdateTask;
import br.edu.ifce.mn.ads.ifproject.task.domain.usecase.update.TaskResponse;
import br.edu.ifce.mn.ads.ifproject.task.domain.usecase.update.UpdateTaskRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {

    private final ICreateTask createTask;
    private final IUpdateTask updateTask;
    private final IActivateTask activateTask;
    private final IArchivedTask archivedTask;

    public TaskController(ICreateTask createTask, IUpdateTask updateTask, IActivateTask activateTask,  IArchivedTask archivedTask) {
        this.createTask = createTask;
        this.updateTask = updateTask;
        this.activateTask = activateTask;
        this.archivedTask = archivedTask;
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody Task request) {
        createTask.execute(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PatchMapping("/{id}/activate")
    public ResponseEntity<Void> activate(@PathVariable UUID id) {
        activateTask.execute(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}/archived")
    public ResponseEntity<Void> archived(@PathVariable UUID id) {
        archivedTask.execute(id);
        return ResponseEntity.noContent().build();
    }


    @PutMapping("/{id}")
    public ResponseEntity<TaskResponse> update(
            @PathVariable UUID id,
            @RequestBody UpdateTaskRequest request
    ) {
        var response = updateTask.execute(id, request);
        return ResponseEntity.ok(response);
    }

}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task/domain/exceptions/TaskNotFoundException.java`

```java
package br.edu.ifce.mn.ads.ifproject.task.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

public class TaskNotFoundException extends ApiException {
    public TaskNotFoundException() {
        super(HttpStatus.NOT_FOUND, "Tarefa não encontrada");
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task/domain/model/Task.java`

```java
package br.edu.ifce.mn.ads.ifproject.task.domain.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;
import java.util.UUID;



@Table("tasks")
public class Task implements Persistable<UUID> {
    @Id
    private UUID id;
    private UUID taskGroupId;
    private UUID creatorId;
    private UUID assigneeId;
    private String title;
    private String description;
    private String priority; // 'LOW', 'MEDIUM', 'HIGH'
    private Integer position;
    private LocalDateTime dueDate;
    private Boolean isArchived;
    private LocalDateTime createdAt;

    @org.springframework.data.annotation.Transient
    private boolean isNew = true;



    public Task() {
        this.isArchived = false;
    }
    public void activate() {
        this.isArchived = false;
    }

    public void update(String title,String description) {
        if (title != null) {
            this.title = title;
        }
        if (description != null) {
            this.description = description;
        }
    }

    public Task(UUID id, UUID taskGroupId, UUID creatorId, UUID assigneeId, String title, String description, String priority, Integer position, LocalDateTime dueDate, LocalDateTime createdAt) {
        this.id = id;
        this.taskGroupId = taskGroupId;
        this.creatorId = creatorId;
        this.assigneeId = assigneeId;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.position = position;
        this.dueDate = dueDate;
        this.createdAt = createdAt;
    }
    @Override
    public UUID getId() { return this.id; }

    @Override
    public boolean isNew() {
        return this.isNew;
    }
    public void markAsNotNew() {
        this.isNew = false;
    }

    public void setId(UUID id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public void archived(){
        this.isArchived = true;
    }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }

    public Integer getPosition() { return position; }
    public void setPosition(Integer position) { this.position = position; }

    public Boolean getIsArchived() { return isArchived; }
    public void setIsArchived(Boolean archived) { isArchived = archived; }

    public UUID getTaskGroupId() { return taskGroupId; }
    public void setTaskGroupId(UUID taskGroupId) { this.taskGroupId = taskGroupId; }

    public UUID getCreatorId() { return creatorId; }
    public void setCreatorId(UUID creatorId) { this.creatorId = creatorId; }

    public UUID getAssigneeId() { return assigneeId; }
    public void setAssigneeId(UUID assigneeId) { this.assigneeId = assigneeId; }

    public LocalDateTime getDueDate() { return dueDate; }
    public void setDueDate(LocalDateTime dueDate) { this.dueDate = dueDate; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }




}




```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task/domain/usecase/activate/ActivateTask.java`

```java
package br.edu.ifce.mn.ads.ifproject.task.domain.usecase.activate;
import br.edu.ifce.mn.ads.ifproject.task.domain.exceptions.TaskNotFoundException;
import br.edu.ifce.mn.ads.ifproject.task.domain.model.Task;
import br.edu.ifce.mn.ads.ifproject.task.infra.repositories.ITaskRepository;
import org.springframework.stereotype.Component;
import java.util.UUID;
import java.util.Optional;

@Component
public class ActivateTask implements IActivateTask {
    private final ITaskRepository taskRepository;

    public ActivateTask(ITaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task execute(UUID id) {
        Optional<Task> optionalTask = taskRepository.findById(id);

        if (optionalTask.isEmpty()) {
            throw new TaskNotFoundException();
        }

        Task task = optionalTask.get();

        task.markAsNotNew();

        task.activate();

        return taskRepository.save(task);

    }

}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task/domain/usecase/activate/IActivateTask.java`

```java
package br.edu.ifce.mn.ads.ifproject.task.domain.usecase.activate;

import br.edu.ifce.mn.ads.ifproject.task.domain.model.Task;
import java.util.UUID;

public interface IActivateTask {
    Task execute(UUID id);
}
```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task/domain/usecase/archived/ArchivedTask.java`

```java
package br.edu.ifce.mn.ads.ifproject.task.domain.usecase.archived;
import br.edu.ifce.mn.ads.ifproject.task.domain.exceptions.TaskNotFoundException;
import br.edu.ifce.mn.ads.ifproject.task.domain.model.Task;
import br.edu.ifce.mn.ads.ifproject.task.infra.repositories.ITaskRepository;
import org.springframework.stereotype.Component;
import java.util.UUID;
import java.util.Optional;

@Component
public class ArchivedTask implements IArchivedTask  {
    private final ITaskRepository taskRepository;

    public ArchivedTask(ITaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task execute(UUID id) {
        Optional<Task> optionalTask = taskRepository.findById(id);

        if (optionalTask.isEmpty()) {
            throw new TaskNotFoundException();
        }

        Task task = optionalTask.get();

        task.markAsNotNew();

        task.archived();

        return taskRepository.save(task);

    }

}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task/domain/usecase/archived/IArchivedTask.java`

```java
package br.edu.ifce.mn.ads.ifproject.task.domain.usecase.archived;

import br.edu.ifce.mn.ads.ifproject.task.domain.model.Task;

import java.util.UUID;

public interface IArchivedTask {

    Task execute(UUID id);
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task/domain/usecase/create/CreateTask.java`

```java
package br.edu.ifce.mn.ads.ifproject.task.domain.usecase.create;

import br.edu.ifce.mn.ads.ifproject.task.domain.model.Task;
import br.edu.ifce.mn.ads.ifproject.task.infra.repositories.ITaskRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class CreateTask implements ICreateTask {

    private final ITaskRepository taskRepository;

    public CreateTask(ITaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task execute(Task task) {
        task.setId(UUID.randomUUID());
        task.setIsArchived(false);
        task.setCreatedAt(LocalDateTime.now());

        Task savedTask = taskRepository.save(task);

        savedTask.markAsNotNew();

        return savedTask;
    }
}
```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task/domain/usecase/create/ICreateTask.java`

```java
package br.edu.ifce.mn.ads.ifproject.task.domain.usecase.create;

import br.edu.ifce.mn.ads.ifproject.task.domain.model.Task;

public interface ICreateTask {
    Task execute(Task task);
}
```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task/domain/usecase/update/IUpdateTask.java`

```java
package br.edu.ifce.mn.ads.ifproject.task.domain.usecase.update;

import java.util.UUID;

public interface IUpdateTask {
    TaskResponse execute(UUID id, UpdateTaskRequest request);
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task/domain/usecase/update/TaskResponse.java`

```java
package br.edu.ifce.mn.ads.ifproject.task.domain.usecase.update;

import br.edu.ifce.mn.ads.ifproject.task.domain.model.Task;

import java.util.UUID;

public record TaskResponse(UUID id,String title, String description, boolean isAchived) {

    public TaskResponse (Task task) {
        this (task.getId(), task.getTitle(), task.getDescription(), task.getIsArchived());
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task/domain/usecase/update/UpdateTask.java`

```java
package br.edu.ifce.mn.ads.ifproject.task.domain.usecase.update;

import br.edu.ifce.mn.ads.ifproject.task.domain.exceptions.TaskNotFoundException;
import br.edu.ifce.mn.ads.ifproject.task.infra.repositories.ITaskRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UpdateTask implements IUpdateTask {

    private final ITaskRepository taskRepository;

    public UpdateTask(ITaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    @Override
    public TaskResponse  execute(UUID id, UpdateTaskRequest request) {

        var task = taskRepository.findById(id)
                .orElseThrow(TaskNotFoundException::new);
        task.markAsNotNew();

        task.update(request.title(), request.description());

        taskRepository.save(task);

        return new TaskResponse(task);

    }

}



```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task/domain/usecase/update/UpdateTaskRequest.java`

```java
package br.edu.ifce.mn.ads.ifproject.task.domain.usecase.update;
import java.util.UUID;

public record UpdateTaskRequest( String title, String description) {

}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task/infra/repositories/ITaskRepository.java`

```java
package br.edu.ifce.mn.ads.ifproject.task.infra.repositories;


import br.edu.ifce.mn.ads.ifproject.task.domain.model.Task;
import org.springframework.data.repository.ListCrudRepository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface ITaskRepository extends ListCrudRepository<Task, UUID> {

    Task save(Task task);

    Optional<Task> findById(UUID id);

    List<Task> findByTaskGroupId(UUID TaskGrupId);

    void deleteById(UUID id);

}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/application/controllers/TaskGroupController.java`

```java
package br.edu.ifce.mn.ads.ifproject.task_groups.application.controllers;

import br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.archive.IArchiveTask;
import br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.create.ICreateColumn;
import br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.delete.IDeleteColumn;
import br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.move.IMoveColumn;
import br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.update.IRenameColumn;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/task-groups")
public class TaskGroupController {

    private final IArchiveTask archiveTask;
    private final ICreateColumn createColumn;
    private final IRenameColumn renameColumn;
    private final IDeleteColumn deleteColumn;
    private final IMoveColumn moveColumn;

    public TaskGroupController(IArchiveTask archiveTask, ICreateColumn createColumn, IRenameColumn renameColumn, IDeleteColumn deleteColumn, IMoveColumn moveColumn) {
        this.archiveTask = archiveTask;
        this.createColumn = createColumn;
        this.renameColumn = renameColumn;
        this.deleteColumn = deleteColumn;
        this.moveColumn = moveColumn;
    }

    @PatchMapping("{task_group_id}/archive")
    public IArchiveTask.ArchiveTaskOutput patch(
            @PathVariable("task_group_id") UUID id
    ){
        return archiveTask.execute(id);
    }

    @PostMapping
    public ICreateColumn.CreateColumnOutput post(
            @RequestBody ICreateColumn.CreateColumnInput input
    ){
        return createColumn.execute(input);
    }
    @PatchMapping("{task_group_id}/rename")
    public IRenameColumn.RenameColumnOutput patch(
            @PathVariable("task_group_id") UUID id,
            @RequestBody IRenameColumn.RenameColumnInput input
    ){
        return renameColumn.execute(id, input);
    }
    @DeleteMapping("{task_group_id}")
    public IDeleteColumn.IDeleteColumnOutput delete(
            @PathVariable("task_group_id") UUID id
    ){
        return deleteColumn.execute(id);
    }

    @PatchMapping("{task_group_id}/move")
    public IMoveColumn.MoveColumnOutput move(
            @PathVariable("task_group_id") UUID id,
            @RequestBody IMoveColumn.MoveColumnInput input
    ){
        return moveColumn.execute(id, input);
    }

}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/exceptions/ColumnNotFoundException.java`

```java
package br.edu.ifce.mn.ads.ifproject.task_groups.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

public class ColumnNotFoundException extends ApiException {
    public ColumnNotFoundException() {
        super(HttpStatus.NOT_FOUND, "Coluna não encontrada");
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/archive/ArchiveTask.java`

```java
package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.archive;

import br.edu.ifce.mn.ads.ifproject.task_groups.domain.exceptions.ColumnNotFoundException;
import br.edu.ifce.mn.ads.ifproject.task_groups.infra.repositories.ITaskGroupRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ArchiveTask implements IArchiveTask{

    private final ITaskGroupRepository repository;

    public ArchiveTask(ITaskGroupRepository repository) {
        this.repository = repository;
    }

    @Override
    public ArchiveTaskOutput execute(UUID id) {
        if (!repository.exists(id)) {
            throw new ColumnNotFoundException();
        }
        repository.persist(id);
        return new ArchiveTaskOutput(id);
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/archive/IArchiveTask.java`

```java
package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.archive;

import java.util.UUID;

public interface IArchiveTask {

    ArchiveTaskOutput execute(UUID id);

    record ArchiveTaskOutput(
            UUID id
    ) {
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/create/CreateColumn.java`

```java
package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.create;

import br.edu.ifce.mn.ads.ifproject.task_groups.infra.repositories.TaskGroupRepository;
import org.springframework.stereotype.Component;

@Component
public class CreateColumn implements ICreateColumn{

    private final TaskGroupRepository repository;

    public CreateColumn(TaskGroupRepository repository) {
        this.repository = repository;
    }

    @Override
    public CreateColumnOutput execute(CreateColumnInput input) {
        final var id = repository.persist(input);
        return new CreateColumnOutput(id);
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/create/ICreateColumn.java`

```java
package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.create;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface ICreateColumn {
    CreateColumnOutput execute(@Valid CreateColumnInput input);

    record CreateColumnInput(
            @NotBlank(message = "O nome da coluna é obrigatório")
            @Size(max = 50, message = "O nome da coluna deve ter até 50 caracteres")
            String name,
            @NotNull(message = "A posição da coluna é obrigatória")
            Long position,
            @NotNull(message = "O quadro é obrigatório")
            UUID boardId
    ){

    }
    record CreateColumnOutput(
            UUID id
    ){

    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/delete/DeleteColumn.java`

```java
package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.delete;


import br.edu.ifce.mn.ads.ifproject.task_groups.domain.exceptions.ColumnNotFoundException;
import br.edu.ifce.mn.ads.ifproject.task_groups.infra.repositories.ITaskGroupRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class DeleteColumn implements IDeleteColumn {

    private final ITaskGroupRepository repository;

    public DeleteColumn(ITaskGroupRepository repository) {
        this.repository = repository;
    }

    @Override
    public IDeleteColumnOutput execute(UUID id) {
        if (!repository.exists(id)) {
            throw new ColumnNotFoundException();
        }
        final var columnId = repository.delete(id);
        return new IDeleteColumnOutput(columnId);
    }
}


```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/delete/IDeleteColumn.java`

```java
package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.delete;

import java.util.UUID;

public interface IDeleteColumn {
    IDeleteColumnOutput execute(UUID id);

    record IDeleteColumnOutput(
            UUID id
    ) {
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/move/IMoveColumn.java`

```java
package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.move;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface IMoveColumn {

    MoveColumnOutput execute(UUID id, @Valid MoveColumnInput input);

    record MoveColumnInput(
            @NotNull(message = "A nova posição é obrigatória")
            Long newPosition,
            @NotNull(message = "O quadro é obrigatório")
            UUID boardId
    ){}

    record MoveColumnOutput(
            UUID id
    ){}
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/move/MoveColumn.java`

```java
package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.move;

import br.edu.ifce.mn.ads.ifproject.task_groups.domain.exceptions.ColumnNotFoundException;
import br.edu.ifce.mn.ads.ifproject.task_groups.infra.repositories.TaskGroupRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Component
public class MoveColumn implements IMoveColumn {

    private final TaskGroupRepository repository;

    public MoveColumn(TaskGroupRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public MoveColumnOutput execute(UUID id, MoveColumnInput input) {
        if (!repository.exists(id)) {
            throw new ColumnNotFoundException();
        }
        final Long currentPosition = repository.findPositionById(id);

        if(currentPosition.equals(input.newPosition())){
            return new MoveColumnOutput(id);
        }

        if(input.newPosition() < currentPosition){
            repository.incrementPositions(
                    input.boardId(),
                    input.newPosition(),
                    currentPosition
            );
        } else {
            repository.decrementPositions(
                    input.boardId(),
                    input.newPosition(),
                    currentPosition
            );
        }

        repository.updatePosition(id,input.newPosition());

        return new MoveColumnOutput(id);
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/update/IRenameColumn.java`

```java
package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.update;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface IRenameColumn {

    RenameColumnOutput execute(UUID id, @Valid RenameColumnInput input);

    record RenameColumnInput(
            @NotBlank(message = "O nome da coluna é obrigatório")
            @Size(max = 50, message = "O nome da coluna deve ter até 50 caracteres")
            String name
    ){

    }
    record RenameColumnOutput(
        UUID id
    ){

    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/update/RenameColumn.java`

```java
package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.update;

import br.edu.ifce.mn.ads.ifproject.task_groups.domain.exceptions.ColumnNotFoundException;
import br.edu.ifce.mn.ads.ifproject.task_groups.infra.repositories.ITaskGroupRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RenameColumn implements IRenameColumn{

    private final ITaskGroupRepository repository;

    public RenameColumn(ITaskGroupRepository repository) {
        this.repository = repository;
    }


    @Override
    public IRenameColumn.RenameColumnOutput execute(UUID id, RenameColumnInput input){
        if (!repository.exists(id)) {
            throw new ColumnNotFoundException();
        }
        final var columnId = repository.persist(id, input);
        return new RenameColumnOutput(columnId);
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/infra/repositories/ITaskGroupRepository.java`

```java
package br.edu.ifce.mn.ads.ifproject.task_groups.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.create.ICreateColumn;
import br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.update.IRenameColumn;

import java.util.UUID;

public interface ITaskGroupRepository {
    UUID persist(UUID id);
    UUID persist(ICreateColumn.CreateColumnInput input);
    UUID persist(UUID id, IRenameColumn.RenameColumnInput input );
    UUID delete(UUID id);
    boolean exists(UUID id);

    Long findPositionById(UUID id);

    void updatePosition(UUID id, Long newPosition);
    void incrementPositions(UUID boardId, Long newPosition, Long oldPosition);
    void decrementPositions(UUID boardId, Long newPosition, Long oldPosition);


}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/infra/repositories/TaskGroupRepository.java`

```java
package br.edu.ifce.mn.ads.ifproject.task_groups.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.create.ICreateColumn;
import br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.update.IRenameColumn;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TaskGroupRepository implements  ITaskGroupRepository{

    private final JdbcClient db;

    public TaskGroupRepository(JdbcClient db) {
        this.db = db;
    }

    @Override
    public UUID persist(UUID id) {
        final var SQL = """
                UPDATE task_groups SET is_archived = true WHERE id = ?
                """;
        db.sql(SQL)
                .param(id)
                .update();
        return id;
    }

    @Override
    public UUID persist(ICreateColumn.CreateColumnInput input) {
        final var SQL = """
            INSERT INTO task_groups(name, position, board_id) VALUES
            (?, ?, ?)
            RETURNING id
            """;
        return db.sql(SQL)
                .param(input.name())
                .param(input.position())
                .param(input.boardId())
                .query(UUID.class)
                .single();
    }

    @Override
    public UUID persist(UUID id, IRenameColumn.RenameColumnInput input) {
        final var SQL = """
                UPDATE task_groups SET name = ? WHERE id = ?
                """;
        db.sql(SQL)
                .param(input.name())
                .param(id)
                .update();
        return id;
    }

    @Override
    public UUID delete(UUID id) {
        final var SQL = """
                DELETE FROM task_groups WHERE id = ?
                """;
        db.sql(SQL)
                .param(id)
                .update();
        return id;
    }

    @Override
    public boolean exists(UUID id) {
        return db.sql("SELECT EXISTS(SELECT 1 FROM task_groups WHERE id = ?)")
                .param(id)
                .query(Boolean.class)
                .single();
    }

    @Override
    public Long findPositionById(UUID id) {
        final var SQL = """
                SELECT position FROM task_groups WHERE id = ?
                """;

        return db.sql(SQL)
                .param(id)
                .query(Long.class)
                .single();
    }

    @Override
    public void updatePosition(UUID id, Long newPosition) {
        final var SQL = """
                UPDATE task_groups SET position = ? WHERE id = ?
                """;

        db.sql(SQL)
                .param(newPosition)
                .param(id)
                .update();
    }

    @Override
    public void incrementPositions(UUID boardId, Long newPosition, Long oldPosition) {
        final var SQL = """
                UPDATE task_groups
                SET position = position + 1
                WHERE board_id = ?
                AND position >= ?
                AND position < ?
                """;
        db.sql(SQL)
                .param(boardId)
                .param(newPosition)
                .param(oldPosition)
                .update();
    }

    @Override
    public void decrementPositions(UUID boardId, Long newPosition, Long oldPosition) {
        final var SQL = """
                UPDATE task_groups
                SET position = position - 1
                WHERE board_id = ?
                AND position <= ?
                AND position > ?
                """;
        db.sql(SQL)
                .param(boardId)
                .param(newPosition)
                .param(oldPosition)
                .update();
    }



}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/users/application/controllers/AuthController.java`

```java
package br.edu.ifce.mn.ads.ifproject.users.application.controllers;

import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.authenticate.IAuthenticateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.authenticate.IRefreshSession;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** Endpoints de autenticação destinados a clientes web e mobile. */
@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final IAuthenticateUser authenticateUser;
    private final IRefreshSession refreshSession;

    public AuthController(IAuthenticateUser authenticateUser, IRefreshSession refreshSession) {
        this.authenticateUser = authenticateUser;
        this.refreshSession = refreshSession;
    }

    @PostMapping("/login")
    public IAuthenticateUser.AuthenticateUserOutput login(
            @RequestBody @Valid IAuthenticateUser.AuthenticateUserInput input
    ) {
        return authenticateUser.execute(input);
    }

    @PostMapping("/refresh")
    public IAuthenticateUser.AuthenticateUserOutput refresh(
            @RequestBody @Valid IRefreshSession.RefreshSessionInput input
    ) {
        return refreshSession.execute(input);
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/users/application/controllers/UserController.java`

```java
package br.edu.ifce.mn.ads.ifproject.users.application.controllers;

import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.activate.IActivateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.authenticate.IAuthenticateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.create.ICreateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update.IUpdateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update_password.IUpdateUserPassword;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final ICreateUser createUser;
    private final IAuthenticateUser authenticateUser;
    private final IUpdateUser updateUser;
    private final IUpdateUserPassword updateUserPassword;
    private final IActivateUser activateUser;

    public UserController(
            ICreateUser createUser,
            IAuthenticateUser authenticateUser,
            IUpdateUser updateUser,
            IUpdateUserPassword updateUserPassword,
            IActivateUser activateUser
    ) {
        this.createUser = createUser;
        this.authenticateUser = authenticateUser;
        this.updateUser = updateUser;
        this.updateUserPassword = updateUserPassword;
        this.activateUser = activateUser;
    }

    @PostMapping
    public ResponseEntity<ICreateUser.CreateUserOutput> post(@RequestBody @Valid ICreateUser.CreateUserInput input) {
        return ResponseEntity.status(HttpStatus.CREATED).body(createUser.execute(input));
    }

    @Deprecated(since = "1.0", forRemoval = false)
    @PostMapping("/login")
    public IAuthenticateUser.AuthenticateUserOutput login(@RequestBody @Valid IAuthenticateUser.AuthenticateUserInput input) {
        return authenticateUser.execute(input);
    }

    @PatchMapping("{user_id}")
    public IUpdateUser.UpdateUserOutput patch(
            @PathVariable("user_id") UUID id,
            @RequestBody @Valid IUpdateUser.UpdateUserInput input
    ) {
        requireCurrentUser(id);
        return updateUser.execute(id, input);
    }

    @PatchMapping("{user_id}/password")
    public IUpdateUserPassword.UpdateUserPasswordOutput patch(
            @PathVariable("user_id") UUID id,
            @RequestBody @Valid IUpdateUserPassword.UpdateUserPasswordInput input
    ) {
        requireCurrentUser(id);
        return updateUserPassword.execute(id, input);
    }

    @PatchMapping("{user_id}/active")
    public IActivateUser.ActivateUserOutput patch(
            @PathVariable("user_id") UUID id
    ) {
        requireCurrentUser(id);
        return activateUser.execute(id);
    }

    private static void requireCurrentUser(UUID id) {
        if (!UserLogged.id().equals(id)) {
            throw new ApiException(HttpStatus.FORBIDDEN, "Você não tem permissão para alterar este usuário");
        }
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/exceptions/EmailAlreadyExistsException.java`

```java
package br.edu.ifce.mn.ads.ifproject.users.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

public class EmailAlreadyExistsException extends ApiException {
    public EmailAlreadyExistsException() {
        super(HttpStatus.CONFLICT, "Este e-mail já está em uso");
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/exceptions/InvalidCredentialsException.java`

```java
package br.edu.ifce.mn.ads.ifproject.users.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

public class InvalidCredentialsException extends ApiException {
    public InvalidCredentialsException() {
        super(HttpStatus.UNAUTHORIZED, "E-mail ou senha não conferem.");
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/exceptions/InvalidCurrentPasswordException.java`

```java
package br.edu.ifce.mn.ads.ifproject.users.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

public class InvalidCurrentPasswordException extends ApiException {
    public InvalidCurrentPasswordException() {
        super(HttpStatus.BAD_REQUEST, "A senha atual não confere");
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/exceptions/UserNotFoundException.java`

```java
package br.edu.ifce.mn.ads.ifproject.users.domain.exceptions;

import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
import org.springframework.http.HttpStatus;

public class UserNotFoundException extends ApiException {
    public UserNotFoundException() {
        super(HttpStatus.NOT_FOUND, "Usuário não encontrado");
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/models/Password.java`

```java
package br.edu.ifce.mn.ads.ifproject.users.domain.models;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.Size;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Size(min = 4, max = 8, message = "A senha deve ter entre 4 e 8 caracteres")
@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = {})
public @interface Password {
    String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/models/Username.java`

```java
package br.edu.ifce.mn.ads.ifproject.users.domain.models;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.Size;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Size(min = 3, max = 10, message = "O nome de usuário deve ter entre 3 e 10 caracteres")
@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = {})
public @interface Username {
    String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/activate/ActivateUser.java`

```java
package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.activate;

import br.edu.ifce.mn.ads.ifproject.users.domain.exceptions.UserNotFoundException;
import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ActivateUser implements IActivateUser {

    private final IUserRepository repository;

    public ActivateUser(IUserRepository repository) {

        this.repository = repository;
    }

    @Override
    public ActivateUserOutput execute(UUID id) {
        if (!repository.existsById(id)) {
            throw new UserNotFoundException();
        }
        final var userId = repository.active(id);
        return new ActivateUserOutput(userId);
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/activate/IActivateUser.java`

```java
package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.activate;

import java.util.UUID;

public interface IActivateUser {

    ActivateUserOutput execute(UUID id);

    record ActivateUserOutput(
            UUID id
    ) {
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/authenticate/AuthenticateUser.java`

```java
package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.authenticate;

import br.edu.ifce.mn.ads.ifproject._commons.security.JwtService;
import br.edu.ifce.mn.ads.ifproject._commons.security.RefreshTokenService;
import br.edu.ifce.mn.ads.ifproject.users.domain.exceptions.InvalidCredentialsException;
import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;
import org.springframework.stereotype.Component;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Component
public class AuthenticateUser implements IAuthenticateUser {

    private final IUserRepository repository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final RefreshTokenService refreshTokenService;

    public AuthenticateUser(
            IUserRepository repository,
            JwtService jwtService,
            PasswordEncoder passwordEncoder,
            RefreshTokenService refreshTokenService
    ) {
        this.repository = repository;
        this.jwtService = jwtService;
        this.passwordEncoder = passwordEncoder;
        this.refreshTokenService = refreshTokenService;
    }

    @Override
    public AuthenticateUserOutput execute(AuthenticateUserInput input) {
        final var user = repository.findByEmail(input.email())
                .orElseThrow(InvalidCredentialsException::new);
        if (passwordEncoder.matches(input.password(), user.passwordHash())) {
            return output(user);
        }
        if (matchesLegacyMd5(input.password(), user.passwordHash())) {
            repository.updatePassword(user.id(), passwordEncoder.encode(input.password()));
            return output(user);
        }
        throw new InvalidCredentialsException();
    }

    private AuthenticateUserOutput output(IUserRepository.AuthenticatedUserWithPassword user) {
        return new AuthenticateUserOutput(
                user.id(),
                user.username(),
                user.email(),
                jwtService.issue(user.id()),
                "Bearer",
                jwtService.expirationSeconds(),
                refreshTokenService.issue(user.id())
        );
    }

    /**
     * Compatibilidade transitória para contas já gravadas com MD5. No primeiro
     * login válido, a senha é substituída por BCrypt e nunca mais usa este ramo.
     */
    private static boolean matchesLegacyMd5(String password, String storedHash) {
        if (storedHash == null || !storedHash.matches("[a-fA-F0-9]{32}")) {
            return false;
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5")
                    .digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder hash = new StringBuilder(32);
            for (byte value : digest) {
                hash.append(String.format("%02x", value));
            }
            return MessageDigest.isEqual(
                    hash.toString().getBytes(StandardCharsets.US_ASCII),
                    storedHash.toLowerCase().getBytes(StandardCharsets.US_ASCII)
            );
        } catch (NoSuchAlgorithmException ex) {
            throw new IllegalStateException("Algoritmo MD5 indisponível", ex);
        }
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/authenticate/IAuthenticateUser.java`

```java
package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.authenticate;

import br.edu.ifce.mn.ads.ifproject.users.domain.models.Password;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface IAuthenticateUser {

    AuthenticateUserOutput execute(@Valid AuthenticateUserInput input);

    record AuthenticateUserInput(
            @Email(message = "Informe um e-mail válido") String email,
            @Password String password
    ) {
    }

    record AuthenticatedUser(
            UUID id,
            String username,
            String email
    ) {
    }

    record AuthenticateUserOutput(
            UUID id,
            String username,
            String email,
            String accessToken,
            String tokenType,
            long expiresIn,
            String refreshToken
    ) {
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/authenticate/IRefreshSession.java`

```java
package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.authenticate;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;

@Validated
public interface IRefreshSession {

    IAuthenticateUser.AuthenticateUserOutput execute(@Valid RefreshSessionInput input);

    record RefreshSessionInput(@NotBlank String refreshToken) {
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/authenticate/RefreshSession.java`

```java
package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.authenticate;

import br.edu.ifce.mn.ads.ifproject._commons.security.JwtService;
import br.edu.ifce.mn.ads.ifproject._commons.security.RefreshTokenService;
import br.edu.ifce.mn.ads.ifproject.users.domain.exceptions.InvalidCredentialsException;
import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class RefreshSession implements IRefreshSession {

    private final RefreshTokenService refreshTokenService;
    private final IUserRepository userRepository;
    private final JwtService jwtService;

    public RefreshSession(
            RefreshTokenService refreshTokenService,
            IUserRepository userRepository,
            JwtService jwtService
    ) {
        this.refreshTokenService = refreshTokenService;
        this.userRepository = userRepository;
        this.jwtService = jwtService;
    }

    @Override
    @Transactional
    public IAuthenticateUser.AuthenticateUserOutput execute(RefreshSessionInput input) {
        var userId = refreshTokenService.consume(input.refreshToken());
        var user = userRepository.findById(userId).orElseThrow(InvalidCredentialsException::new);
        return new IAuthenticateUser.AuthenticateUserOutput(
                user.id(),
                user.username(),
                user.email(),
                jwtService.issue(user.id()),
                "Bearer",
                jwtService.expirationSeconds(),
                refreshTokenService.issue(user.id())
        );
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/create/CreateUser.java`

```java
package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.create;

import br.edu.ifce.mn.ads.ifproject.users.domain.exceptions.EmailAlreadyExistsException;
import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;
import org.springframework.stereotype.Component;
import org.springframework.security.crypto.password.PasswordEncoder;

@Component
public class CreateUser implements ICreateUser {

    private final IUserRepository repository;
    private final PasswordEncoder passwordEncoder;

    public CreateUser(IUserRepository repository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public CreateUserOutput execute(CreateUserInput input) {
        if (repository.existsByEmail(input.email())) {
            throw new EmailAlreadyExistsException();
        }

        final var id = repository.persist(input, passwordEncoder.encode(input.password()));

        return new CreateUserOutput(id);
    }

}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/create/ICreateUser.java`

```java
package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.create;

import br.edu.ifce.mn.ads.ifproject.users.domain.models.Password;
import br.edu.ifce.mn.ads.ifproject.users.domain.models.Username;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import org.springframework.validation.annotation.Validated;

@Validated
public interface ICreateUser {

    CreateUserOutput execute(@Valid CreateUserInput input);

    record CreateUserInput(
            @Username String username,
            @Email(message = "Informe um e-mail válido") String email,
            @Password String password
    ) {
    }

    record CreateUserOutput(
            java.util.UUID id
    ) {
    }

}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/update/IUpdateUser.java`

```java
package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update;

import br.edu.ifce.mn.ads.ifproject.users.domain.models.Username;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface IUpdateUser {

    UpdateUserOutput execute(UUID id, @Valid UpdateUserInput input);

    record UpdateUserInput(
            @Username String username,
            @Email(message = "Informe um e-mail válido") String email
    ) {
    }

    record UpdateUserOutput(
            UUID id
    ) {
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/update/UpdateUser.java`

```java
package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update;

import br.edu.ifce.mn.ads.ifproject.users.domain.exceptions.UserNotFoundException;
import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UpdateUser implements IUpdateUser{

    private final IUserRepository repository;

    public UpdateUser(IUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UpdateUserOutput execute(UUID id, UpdateUserInput input) {
        if (!repository.existsById(id)) {
            throw new UserNotFoundException();
        }
        final var userId = repository.persist(id, input);
        return new UpdateUserOutput(userId);
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/update_password/IUpdateUserPassword.java`

```java
package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update_password;

import br.edu.ifce.mn.ads.ifproject.users.domain.models.Password;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface IUpdateUserPassword {

    UpdateUserPasswordOutput execute(UUID id, @Valid UpdateUserPasswordInput input);

    record UpdateUserPasswordInput(
            @Password String oldPassword,
            @Password String newPassword
    ) {
    }

    record UpdateUserPasswordOutput(
            UUID id
    ) {
    }

}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/update_password/UpdateUserPassword.java`

```java
package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update_password;

import br.edu.ifce.mn.ads.ifproject.users.domain.exceptions.InvalidCurrentPasswordException;
import br.edu.ifce.mn.ads.ifproject.users.domain.exceptions.UserNotFoundException;
import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;
import org.springframework.stereotype.Component;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.UUID;

@Component
public class UpdateUserPassword implements IUpdateUserPassword {

    private final IUserRepository repository;
    private final PasswordEncoder passwordEncoder;

    public UpdateUserPassword(IUserRepository repository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UpdateUserPasswordOutput execute(UUID id, UpdateUserPasswordInput input) {
        final var user = repository.findById(id).orElseThrow(UserNotFoundException::new);
        if (!passwordEncoder.matches(input.oldPassword(), user.passwordHash())) {
            throw new InvalidCurrentPasswordException();
        }
        repository.updatePassword(id, passwordEncoder.encode(input.newPassword()));
        return new UpdateUserPasswordOutput(id);
    }

}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/users/infra/repositories/IUserRepository.java`

```java
package br.edu.ifce.mn.ads.ifproject.users.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.authenticate.IAuthenticateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.create.ICreateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update.IUpdateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update_password.IUpdateUserPassword;

import java.util.Optional;
import java.util.UUID;

public interface IUserRepository {
    Optional<AuthenticatedUserWithPassword> findByEmail(String email);

    Optional<AuthenticatedUserWithPassword> findById(UUID id);

    UUID persist(ICreateUser.CreateUserInput input, String passwordHash);

    UUID persist(UUID id, IUpdateUser.UpdateUserInput input);

    int updatePassword(UUID id, String passwordHash);

    UUID active(UUID id);

    boolean existsById(UUID id);

    boolean existsByEmail(String email);

    record AuthenticatedUserWithPassword(
            UUID id,
            String username,
            String email,
            String passwordHash
    ) {
    }
}

```

## `src/main/java/br/edu/ifce/mn/ads/ifproject/users/infra/repositories/UserRepository.java`

```java
package br.edu.ifce.mn.ads.ifproject.users.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.create.ICreateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update.IUpdateUser;
import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.update_password.IUpdateUserPassword;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class UserRepository implements IUserRepository {

    private final JdbcClient db;

    public UserRepository(JdbcClient db) {
        this.db = db;
    }

    @Override
    public Optional<AuthenticatedUserWithPassword> findByEmail(String email) {
        final var SQL = """
                SELECT id, username, email, password_hash
                FROM users
                WHERE lower(email) = lower(?)
                  AND is_active = true
                """;

        return db.sql(SQL)
                .param(email)
                .query(AuthenticatedUserWithPassword.class)
                .optional();
    }

    @Override
    public Optional<AuthenticatedUserWithPassword> findById(UUID id) {
        final var sql = """
                SELECT id, username, email, password_hash
                FROM users
                WHERE id = ?
                """;
        return db.sql(sql)
                .param(id)
                .query(AuthenticatedUserWithPassword.class)
                .optional();
    }

    @Override
    public UUID persist(ICreateUser.CreateUserInput input, String passwordHash) {
        final var SQL = """
                    INSERT INTO users(username, email, password_hash) VALUES
                    (?, ?, ?)
                    RETURNING id
                """;

        return db.sql(SQL)
                .param(input.username())
                .param(input.email())
                .param(passwordHash)
                .query(UUID.class)
                .single();

    }

    @Override
    public UUID persist(UUID id, IUpdateUser.UpdateUserInput input) {
        final var SQL = """
                UPDATE users SET username = ?, email = ? WHERE id = ?
                """;

        db.sql(SQL)
                .param(input.username())
                .param(input.email())
                .param(id)
                .update();
        return id;
    }

    @Override
    public int updatePassword(UUID id, String passwordHash) {
        final var SQL = """
                UPDATE users SET password_hash = ? WHERE id = ?
                """;

        return db.sql(SQL)
                .param(passwordHash)
                .param(id)
                .update();
    }

    @Override
    public UUID active(UUID id) {
        final var SQL = """
                UPDATE users SET is_active = true WHERE id = ?
                """;
        db.sql(SQL)
                .param(id)
                .update();
        return id;
    }

    @Override
    public boolean existsById(UUID id) {
        return db.sql("SELECT EXISTS(SELECT 1 FROM users WHERE id = ?)")
                .param(id)
                .query(Boolean.class)
                .single();
    }

    @Override
    public boolean existsByEmail(String email) {
        return db.sql("SELECT EXISTS(SELECT 1 FROM users WHERE lower(email) = lower(?))")
                .param(email)
                .query(Boolean.class)
                .single();
    }
}

```

## `src/main/resources/application.yaml`

```yaml
spring:
  application:
    name: postgres
  datasource:
    url: jdbc:postgresql://localhost:5432/if-project
    username: postgres
    password: postgres
  sql:
    init:
      mode: never
  flyway:
    baseline-on-migrate: true

app:
  jwt:
    secret: "${JWT_SECRET:if-project-dev-secret-key-change-me-32b+}"
    expiration: 24h
    refresh-expiration: 30d
  cors:
    allowed-origins: ${CORS_ALLOWED_ORIGINS:http://localhost:5173,http://localhost:3000,http://127.0.0.1:5173,http://127.0.0.1:3000}

```

## `src/main/resources/db/migration/V1__initial_schema.sql`

```sql
CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE IF NOT EXISTS users
(
    id            UUID PRIMARY KEY         DEFAULT gen_random_uuid(),
    username      VARCHAR(50)  NOT NULL UNIQUE,
    email         VARCHAR(100) NOT NULL UNIQUE,
    password_hash VARCHAR(255) NOT NULL,
    is_active     BOOLEAN                  DEFAULT TRUE,
    created_at    TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS projects
(
    id          UUID PRIMARY KEY         DEFAULT gen_random_uuid(),
    name        VARCHAR(100) NOT NULL,
    owner_id    UUID         NOT NULL REFERENCES users (id),
    archived_at TIMESTAMP WITH TIME ZONE,
    created_at  TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS project_members
(
    project_id UUID REFERENCES projects (id) ON DELETE CASCADE,
    user_id    UUID REFERENCES users (id) ON DELETE CASCADE,
    role       VARCHAR(20)              DEFAULT 'MEMBER',
    joined_at  TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (project_id, user_id)
);

CREATE TABLE IF NOT EXISTS boards
(
    id          UUID PRIMARY KEY         DEFAULT gen_random_uuid(),
    project_id  UUID REFERENCES projects (id) ON DELETE CASCADE,
    name        VARCHAR(100) NOT NULL,
    color_hex   VARCHAR(7)               DEFAULT '#ebecf0',
    is_archived BOOLEAN                  DEFAULT FALSE,
    created_at  TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS task_groups
(
    id          UUID PRIMARY KEY         DEFAULT gen_random_uuid(),
    board_id    UUID REFERENCES boards (id) ON DELETE CASCADE,
    name        VARCHAR(100) NOT NULL,
    position    INTEGER      NOT NULL,
    is_archived BOOLEAN                  DEFAULT FALSE,
    created_at  TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS tasks
(
    id            UUID PRIMARY KEY         DEFAULT gen_random_uuid(),
    task_group_id UUID REFERENCES task_groups (id) ON DELETE CASCADE,
    creator_id    UUID REFERENCES users (id),
    assignee_id   UUID         REFERENCES users (id) ON DELETE SET NULL,
    title         VARCHAR(200) NOT NULL,
    description   TEXT,
    priority      VARCHAR(20) CHECK (priority IN ('LOW', 'MEDIUM', 'HIGH')),
    position      INTEGER      NOT NULL,
    due_date      TIMESTAMP WITH TIME ZONE,
    is_archived   BOOLEAN                  DEFAULT FALSE,
    created_at    TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS subtasks
(
    id           UUID PRIMARY KEY         DEFAULT gen_random_uuid(),
    task_id      UUID REFERENCES tasks (id) ON DELETE CASCADE,
    description  TEXT    NOT NULL,
    is_completed BOOLEAN                  DEFAULT FALSE,
    position     INTEGER NOT NULL,
    created_at   TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

```

## `src/main/resources/db/migration/V2__create_refresh_tokens.sql`

```sql
CREATE TABLE IF NOT EXISTS refresh_tokens
(
    id         UUID PRIMARY KEY         DEFAULT gen_random_uuid(),
    user_id    UUID         NOT NULL REFERENCES users (id) ON DELETE CASCADE,
    token_hash VARCHAR(64)  NOT NULL UNIQUE,
    expires_at TIMESTAMP WITH TIME ZONE NOT NULL,
    revoked_at TIMESTAMP WITH TIME ZONE,
    created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

CREATE INDEX IF NOT EXISTS idx_refresh_tokens_user_id ON refresh_tokens (user_id);

```

## `src/main/resources/db/migration/V3__backfill_project_owners.sql`

```sql
INSERT INTO project_members(project_id, user_id, role)
SELECT id, owner_id, 'OWNER'
FROM projects
ON CONFLICT (project_id, user_id) DO UPDATE
SET role = 'OWNER';

```

## `src/main/resources/schema.sql`

```sql
CREATE EXTENSION IF NOT EXISTS "pgcrypto";
-- 1. Tabela de Usuários
CREATE TABLE IF NOT EXISTS users
(
    id            UUID PRIMARY KEY         DEFAULT gen_random_uuid(),
    username      VARCHAR(50)  NOT NULL UNIQUE,
    email         VARCHAR(100) NOT NULL UNIQUE,
    password_hash VARCHAR(255) NOT NULL,
    is_active     BOOLEAN                  DEFAULT TRUE,
    created_at    TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

-- 2. Tabela de Projetos
CREATE TABLE IF NOT EXISTS projects
(
    id          UUID PRIMARY KEY         DEFAULT gen_random_uuid(),
    name        VARCHAR(100) NOT NULL,
    owner_id    UUID         NOT NULL REFERENCES users (id),
    archived_at TIMESTAMP WITH TIME ZONE,
    created_at  TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

-- 3. Membros do Projeto
CREATE TABLE IF NOT EXISTS project_members
(
    project_id UUID REFERENCES projects (id) ON DELETE CASCADE,
    user_id    UUID REFERENCES users (id) ON DELETE CASCADE,
    role       VARCHAR(20)              DEFAULT 'MEMBER', -- RF05: ADMIN, MEMBER, VIEWER
    joined_at  TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (project_id, user_id)
);

-- 4. Tabela de Quadros
CREATE TABLE IF NOT EXISTS boards
(
    id          UUID PRIMARY KEY         DEFAULT gen_random_uuid(),
    project_id  UUID REFERENCES projects (id) ON DELETE CASCADE,
    name        VARCHAR(100) NOT NULL,
    color_hex   VARCHAR(7)               DEFAULT '#ebecf0',
    is_archived BOOLEAN                  DEFAULT FALSE, -- RF10: Arquivamento
    created_at  TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

-- 5. Grupos de Tarefas
CREATE TABLE IF NOT EXISTS task_groups
(
    id          UUID PRIMARY KEY         DEFAULT gen_random_uuid(),
    board_id    UUID REFERENCES boards (id) ON DELETE CASCADE,
    name        VARCHAR(100) NOT NULL,
    position    INTEGER      NOT NULL, -- RF12: Ordenação dinâmica
    is_archived BOOLEAN                  DEFAULT FALSE,
    created_at  TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

-- 6. Tarefas
CREATE TABLE IF NOT EXISTS tasks
(
    id            UUID PRIMARY KEY         DEFAULT gen_random_uuid(),
    task_group_id UUID REFERENCES task_groups (id) ON DELETE CASCADE,
    creator_id    UUID REFERENCES users (id),
    assignee_id   UUID         REFERENCES users (id) ON DELETE SET NULL,
    title         VARCHAR(200) NOT NULL,
    description   TEXT,
    priority      VARCHAR(20) CHECK (priority IN ('LOW', 'MEDIUM', 'HIGH')),
    position      INTEGER      NOT NULL, -- RF15: Reordenamento
    due_date      TIMESTAMP WITH TIME ZONE,
    is_archived   BOOLEAN                  DEFAULT FALSE,
    created_at    TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

-- 7. Subtarefas
CREATE TABLE IF NOT EXISTS subtasks
(
    id           UUID PRIMARY KEY         DEFAULT gen_random_uuid(),
    task_id      UUID REFERENCES tasks (id) ON DELETE CASCADE,
    description  TEXT    NOT NULL,
    is_completed BOOLEAN                  DEFAULT FALSE,
    position     INTEGER NOT NULL,
    created_at   TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

```

## `src/test/java/br/edu/ifce/mn/ads/ifproject/IfProjectApplicationTests.java`

```java
package br.edu.ifce.mn.ads.ifproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IfProjectApplicationTests {

    @Test
    void contextLoads() {
    }

}

```
