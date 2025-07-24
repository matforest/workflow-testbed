
# Coverage reporting in Github actions

A basic coverage report can be generated in the Github workflow run. [Here's an an example](https://github.com/testorgmatf/workflow-testbed/actions/runs/16484930642).

The jacoco results are also archived in the run, look for `jacoco-report`, right at the bottom of that page.


# Codecov

This test project's analysis in Codecov: https://app.codecov.io/gh/testorgmatf/workflow-testbed

## Pricing

The free tier allows only a single user to log in; so for private repositories only one user would be able to log in and view/manage the dashboard. But that might be fine if we configure it to add comments to pull requests with coverage details.

At the free tier we'd be limited to 250 builds per month; which is likely only enough for a couple of active projects.

The rest of [Codecov's pricing is here](https://about.codecov.io/pricing/). Starts at $4 per user to get 2500 builds, otherwise $10 per user for unlimited.

## Usage

### Graphs

Generated graphs could be linked in, eg, the readme.

### Pull Requests

Or, probably more usefully, Codecov can comment on pull requests with information about coverage on new code. Here's an example in this test project where I've added new code and it isn't covered with tests: https://github.com/testorgmatf/workflow-testbed/pull/3. In the history of the PR you can see where Codecov has failed the build due to insufficient coverage.

Generating that PR info would require the coverage builds to run on pushes to the main branch, and on PR actions.

## Code Coverage Graphs

### Grid/Tree Map:

![Coverage](https://codecov.io/github/testorgmatf/workflow-testbed/graphs/tree.svg?token=CCIS7HBMMD)

### Icicle:

![Coverage](https://codecov.io/gh/testorgmatf/workflow-testbed/graphs/icicle.svg?token=CCIS7HBMMD)

Opening the SVGs directly gives some details of the files when hovering.


# Github Workflows

## Time & Cost

Running the coverage analysis approximately doubles the workflow run time. e.g. Grid goes from 8-9 minutes to 16-19 minutes; the Skyve project went from 4-5 to ~13, though Sonar does static analysis as well, and takes more time.

We get 2000 minutes per month for free; after that it's [$0.008 per minute](https://docs.github.com/en/billing/managing-billing-for-your-products/about-billing-for-github-actions). So 100 builds of Grid taking 10 minutes longer would cost $8, for example.


# Sonar

Provides static analysis, lots of nice reports.

Analysis is pretty slow. Prohibitively expensive for private projects.

# Coveralls

[Test project here](https://coveralls.io/github/testorgmatf/workflow-testbed). Looks very similar to Codecov.

## Pricing

[Pricing info here](https://coveralls.io/pricing). By my read we'd need to be on at least the _Org_ level to use on private repositories; for $50 per month.